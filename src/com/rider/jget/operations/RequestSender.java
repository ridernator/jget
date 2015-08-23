package com.rider.jget.operations;

import com.rider.jget.GlobalSettings;
import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.JsonConverter;
import com.rider.jget.json.JsonResponseHandler;
import com.rider.jget.json.JsonrpcRequest;
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

    private RequestSender() {
        // Do nothing
    }

    public static String sendRequest(final String operation,
                                     final Map<String, Object> params) throws JGetException {
        final JsonrpcRequest request = new JsonrpcRequest();
        request.setMethod(operation);
        request.setParams(params);

        String response = null;

        try {
            mutex.lock();

            final HttpPost post = new HttpPost("http://" + GlobalSettings.getUsername() + ':' + GlobalSettings.getPassword() + '@' + GlobalSettings.getServer() + ':' + GlobalSettings.getPort() + "/jsonrpc/");
            post.setHeader(HTTP_HEADER_CONTENT_TYPE, APPLICATION_JSON);
            post.setHeader(HTTP_HEADER_ACCEPT, APPLICATION_JSON);
            post.setHeader(HTTP_HEADER_ACCEPT_CHARSET, ENCODING_UTF8);

            post.setEntity(new StringEntity(JsonConverter.convertToJson(request), ENCODING_UTF8));

            final HttpClient httpClient = new DefaultHttpClient();

            HttpConnectionParams.setConnectionTimeout(httpClient.getParams(), TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpClient.getParams(), TIMEOUT);

            response = httpClient.execute(post, new JsonResponseHandler());
        } catch (final IOException exception) {
            throw new JGetException("Error sending request for operation \"" + operation + "\"", -1, "IOException");
        } finally {
            mutex.unlock();
        }

        return response;
    }
}
