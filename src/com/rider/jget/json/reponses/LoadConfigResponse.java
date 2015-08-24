package com.rider.jget.json.reponses;

import com.rider.jget.json.types.Parameter;
import java.util.List;

/**
 *
 * @author rider
 */
public class LoadConfigResponse extends Response {
    private List<Parameter> result;
    
    private LoadConfigResponse() {
        // Do nothing
    }

    public List<Parameter> getLoadedConfig() {
        return result;
    }    
}
