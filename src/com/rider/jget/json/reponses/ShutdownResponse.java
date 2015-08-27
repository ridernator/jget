package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class ShutdownResponse extends Response {
    private boolean result;
    
    private ShutdownResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public boolean isShutdown() {
        return result;
    }    
}
