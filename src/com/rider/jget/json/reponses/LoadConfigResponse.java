package com.rider.jget.json.reponses;

import com.rider.jget.json.types.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ciaron Rider
 */
public class LoadConfigResponse extends Response {
    private List<Parameter> result;
    
    private LoadConfigResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public List<Parameter> getLoadedConfig() {
        if (result == null) {
            result = new ArrayList<>();
        }

        return result;
    }    
}
