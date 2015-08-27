package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class ResetServerVolumeResponse extends Response {
    private boolean result;
    
    private ResetServerVolumeResponse() {
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
