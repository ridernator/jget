package com.rider.jget.json;

import java.util.Map;

public class JsonrpcRequest {
    private String jsonrpc = "2.0";

    private String method;

    private String id = "1";

    private Map<String, Object> params;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(final String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(final String method) {
        this.method = method;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(final Map<String, Object> params) {
        this.params = params;
    }
}
