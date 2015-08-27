package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class RateResponse extends Response {
    private boolean result;
    
    private RateResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public boolean isSuccess() {
        return result;
    }    
}
