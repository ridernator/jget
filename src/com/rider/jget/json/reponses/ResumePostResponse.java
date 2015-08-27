package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class ResumePostResponse extends Response {
    private boolean result;
    
    private ResumePostResponse() {
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
