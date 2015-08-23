package com.rider.jget.json;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class JsonResponseHandler implements ResponseHandler<String> {
    private static final String ENCODING_UTF_8 = "UTF-8";

    @Override
    public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
        final StatusLine statusLine = response.getStatusLine();

        if (statusLine.getStatusCode() >= 300) {
            throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
        }

        final HttpEntity entity = response.getEntity();

        return entity == null ? null : EntityUtils.toString(entity, ENCODING_UTF_8);
    }
}
