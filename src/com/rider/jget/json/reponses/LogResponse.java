package com.rider.jget.json.reponses;

import com.rider.jget.json.types.Log;
import java.util.List;

/**
 *
 * @author Ciaron Rider
 */
public class LogResponse extends Response {
    private List<Log> result;
    
    private LogResponse() {
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
