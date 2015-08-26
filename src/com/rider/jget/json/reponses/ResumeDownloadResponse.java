package com.rider.jget.json.reponses;

/**
 *
 * @author Ciaron Rider
 */
public class ResumeDownloadResponse extends Response {
    private boolean result;
    
    private ResumeDownloadResponse() {
        // Do nothing
    }

    public boolean isSuccess() {
        return result;
    }    
}
