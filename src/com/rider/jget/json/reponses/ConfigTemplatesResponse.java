package com.rider.jget.json.reponses;

import com.rider.jget.json.types.ConfigTemplate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ciaron Rider
 */
public class ConfigTemplatesResponse extends Response {
    private List<ConfigTemplate> result;
    
    private ConfigTemplatesResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public List<ConfigTemplate> getConfigTemplates() {
        if (result == null) {
            result = new ArrayList<>();
        }

        return result;
    }    
}
