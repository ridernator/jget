package com.rider.jget.json;

import java.util.Map;

public class Request {
    private String method;

    private Map<String, Object> params;

    public Request(final String methodName,
                   final Map<String, Object> parameters) {
        method = methodName;
        params = parameters;
    }
}
