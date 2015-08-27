package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class ResumeScanResponse extends Response {
    private boolean result;
    
    private ResumeScanResponse() {
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
