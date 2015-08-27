package com.rider.jget.json;

/**
 *
 * @author rider
 */
public class Request {
    private final String method;

    private final Object params;

    /**
     *
     * @param methodName
     * @param parameters
     */
    public Request(final String methodName,
                   final Object parameters) {
        method = methodName;
        params = parameters;
    }
}
