package com.rider.jget.json.reponses;

import com.rider.jget.json.types.Log;
import java.util.List;

/**
 *
 * @author Ciaron Rider
 */
public class LoadLogResponse extends Response {
    private List<Log> result;
    
    private LoadLogResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public List<Log> getLogs() {
        return result;
    }    
}
