package com.rider.jget.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rider.jget.GlobalSettings;
import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.reponses.Response;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RequestSender {
    private static final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";

    private static final String HTTP_HEADER_ACCEPT = "Accept";

    private static final String HTTP_HEADER_ACCEPT_CHARSET = "Accept-Charset";

    private static final String APPLICATION_JSON = "application/json";

    private static final String ENCODING_UTF8 = "UTF-8";

    private static final int TIMEOUT = 10000;

    private static final Lock mutex = new ReentrantLock();

    private static final Gson gson = new GsonBuilder().create();

    private static final JsonResponseHandler responseHandler = new JsonResponseHandler();

    private RequestSender() {
        // Do nothing
    }

    public static Response sendRequest(final String operation,
                                       final Object parameters,
                                       final Class classType) throws JGetException {
        final Request request = new Request(operation, parameters);

        Response response = null;

        try {
            mutex.lock();

            final HttpPost post = new HttpPost("http://" + GlobalSettings.getUsername() + ':' + GlobalSettings.getPassword() + '@' + GlobalSettings.getServer() + ':' + GlobalSettings.getPort() + "/jsonrpc/");
            post.setHeader(HTTP_HEADER_CONTENT_TYPE, APPLICATION_JSON);
            post.setHeader(HTTP_HEADER_ACCEPT, APPLICATION_JSON);
            post.setHeader(HTTP_HEADER_ACCEPT_CHARSET, ENCODING_UTF8);

            post.setEntity(new StringEntity(gson.toJson(request), ENCODING_UTF8));
            System.out.println("Out : " + gson.toJson(request));

            final HttpClient httpClient = new DefaultHttpClient();

            HttpConnectionParams.setConnectionTimeout(httpClient.getParams(), TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpClient.getParams(), TIMEOUT);

            String responseString = httpClient.execute(post, responseHandler);
            System.out.println("In  : " + responseString);
            response = (Response) gson.fromJson(responseString, classType);
            //response = (Response)gson.fromJson(httpClient.execute(post, responseHandler), classType);
        } catch (final IOException exception) {
            throw new JGetException("Error sending request for operation \"" + operation + "\"", -1, "IOException");
        } finally {
            mutex.unlock();
        }

        return response;
    }
}
