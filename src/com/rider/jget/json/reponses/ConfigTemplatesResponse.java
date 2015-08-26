package com.rider.jget.json.reponses;

import com.rider.jget.json.types.ConfigTemplate;
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

    public List<ConfigTemplate> getConfigTemplates() {
        return result;
    }    
}
