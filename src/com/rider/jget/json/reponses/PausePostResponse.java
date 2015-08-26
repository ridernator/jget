package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class PausePostResponse extends Response {
    private boolean result;
    
    private PausePostResponse() {
        // Do nothing
    }

    public boolean isSuccess() {
        return result;
    }    
}
