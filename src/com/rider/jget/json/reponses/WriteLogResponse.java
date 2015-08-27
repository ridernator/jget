package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class WriteLogResponse extends Response {
    private boolean result;
    
    private WriteLogResponse() {
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
