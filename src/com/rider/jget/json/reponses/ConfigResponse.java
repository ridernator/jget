package com.rider.jget.json.reponses;

import com.rider.jget.json.types.Parameter;
import java.util.List;

/**
 *
 * @author rider
 */
public class ConfigResponse extends Response {
    private List<Parameter> result;
    
    private ConfigResponse() {
        // Do nothing
    }

    public List<Parameter> getConfig() {
        return result;
    }    
}
