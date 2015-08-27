package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class ReloadResponse extends Response {
    private boolean result;
    
    private ReloadResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public boolean isReloaded() {
        return result;
    }    
}
