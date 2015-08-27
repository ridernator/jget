package com.rider.jget.json.reponses;

/**
 *
 * @author rider
 */
public class Response {
    private String version;

    private com.rider.jget.json.types.Error error;

    /**
     *
     * @return
     */
    public String getResponseVersion() {
        return version;
    }

    /**
     *
     * @return
     */
    public com.rider.jget.json.types.Error getError() {
        return error;
    }
}
