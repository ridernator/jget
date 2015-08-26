package com.rider.jget.json;

public class Request {
    private final String method;

    private final Object params;

    public Request(final String methodName,
                   final Object parameters) {
        method = methodName;
        params = parameters;
    }
}
