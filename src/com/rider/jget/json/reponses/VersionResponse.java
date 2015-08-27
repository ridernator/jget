package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class VersionResponse extends Response {
    private String result;
    
    private VersionResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public String getVersion() {
        return result;
    }    
}
