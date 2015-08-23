/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rider.jget;

import com.rider.jget.exceptions.JGetException;
import com.rider.jget.operations.ProgramControl;

/**
 *
 * @author rider
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) throws JGetException {
        GlobalSettings.setServer("alfie");
        GlobalSettings.setPort((short) 6789);
        GlobalSettings.setUsername("rider");
        GlobalSettings.setPassword("********");

        try {
            System.out.println("Version : " + ProgramControl.version());
        } catch (final JGetException exception) {
            System.err.println("Exception : \"" + exception.getMessage() + '\"');
        }
    }

}
