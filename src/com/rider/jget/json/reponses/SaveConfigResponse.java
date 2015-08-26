package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class SaveConfigResponse extends Response {
    private boolean result;
    
    private SaveConfigResponse() {
        // Do nothing
    }

    public boolean isSaved() {
        return result;
    }    
}
