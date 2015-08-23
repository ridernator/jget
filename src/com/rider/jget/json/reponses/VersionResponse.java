/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rider.jget.json.reponses;

/**
 *
 * @author rider
 */
public class VersionResponse extends Response {
    private String result;
    
    private VersionResponse() {
        // Do nothing
    }

    public String getVersion() {
        return result;
    }    
}
