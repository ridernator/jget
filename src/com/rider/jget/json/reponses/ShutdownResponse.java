package com.rider.jget.json.reponses;

/**
 *
 * @author rider
 */
public class ShutdownResponse extends Response {
    private boolean result;
    
    private ShutdownResponse() {
        // Do nothing
    }

    public boolean isShutdown() {
        return result;
    }    
}
