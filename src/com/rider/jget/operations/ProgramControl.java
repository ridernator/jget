/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rider.jget.operations;

import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.JsonConverter;
import com.rider.jget.json.reponses.VersionResponse;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rider
 */
public class ProgramControl {
    private ProgramControl() {
        // Do nothing
    }

    public static String version() throws JGetException {
        final VersionResponse response = JsonConverter.convertFromJson(RequestSender.sendRequest("version", null), VersionResponse.class);
        
        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getVersion();
    }
}
