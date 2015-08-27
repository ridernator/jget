package com.rider.jget.json.reponses;

import com.rider.jget.json.types.ServerVolumes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ciaron Rider
 */
public class ServerVolumesResponse extends Response {
    private List<ServerVolumes> result;
    
    private ServerVolumesResponse() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public List<ServerVolumes> getServerVolumes() {
        if (result == null) {
            result = new ArrayList<>();
        }

        return result;
    }    
}
