package com.rider.jget.json.reponses;

/**
 *
 * @author rider
 */
public class ReloadResponse extends Response {
    private boolean result;
    
    private ReloadResponse() {
        // Do nothing
    }

    public boolean isReloaded() {
        return result;
    }    
}
