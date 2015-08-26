package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class PauseScanResponse extends Response {
    private boolean result;
    
    private PauseScanResponse() {
        // Do nothing
    }

    public boolean isSuccess() {
        return result;
    }    
}
