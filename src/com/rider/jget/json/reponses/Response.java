package com.rider.jget.json.reponses;

public class Response {
    private String version;

    private com.rider.jget.json.types.Error error;

    public String getVersion() {
        return version;
    }

    public com.rider.jget.json.types.Error getError() {
        return error;
    }
}
