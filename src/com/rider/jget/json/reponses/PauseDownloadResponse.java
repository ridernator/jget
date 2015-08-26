package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class PauseDownloadResponse extends Response {
    private boolean result;
    
    private PauseDownloadResponse() {
        // Do nothing
    }

    public boolean isSuccess() {
        return result;
    }    
}
