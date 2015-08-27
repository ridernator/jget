package com.rider.jget.json.reponses;

import com.rider.jget.json.types.Status;

/**
 *
 * @author Ciaron Rider
 */
public class StatusResponse extends Response {
    private Status result;
    
    private StatusResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public Status getStatus() {
        return result;
    }    
}
