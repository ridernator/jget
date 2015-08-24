
package com.rider.jget;

import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.operations.Config;
import com.rider.jget.json.types.Parameter;
import com.rider.jget.operations.Configuration;
import com.rider.jget.operations.ProgramControl;
import java.util.ArrayList;
import java.util.List;

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

//        try {
//            System.out.println("Version : " + ProgramControl.version());
//        } catch (final JGetException exception) {
//            System.err.println("Exception : \"" + exception.getMessage() + '\"');
//        }
//
//        try {
//            System.out.println(ProgramControl.shutdown() ? "Shutdown" : "Not shutdown");
//        } catch (final JGetException exception) {
//            System.err.println("Exception : \"" + exception.getMessage() + '\"');
//        }
//        
//        try {
//            System.out.println(ProgramControl.reload() ? "\nReloaded" : "\nNot reloaded");
//        } catch (final JGetException exception) {
//            System.err.println("Exception : \"" + exception.getMessage() + '\"');
//        }
//        
//        List<Parameter> config = Configuration.config();
//        
//        System.out.println("\nParameters\n----------");
//        for (final Parameter param : config) {
//            System.out.println(param.getName()+" => "+param.getValue());
//        }
//        
//        List<Parameter> loadedConfig = Configuration.loadConfig();
//
//        System.out.println("\nLoaded Parameters\n-----------------");
//        for (final Parameter param : loadedConfig) {
//            System.out.println(param.getName() + " => " + param.getValue());
//        }
//        
        List<Parameter> params = new ArrayList<>();
         params.add(new Parameter("Bob", "Builder"));
                
        try {
            System.out.println(Configuration.saveConfig(params)? "Parameters saved" : "Parameters not saved");
        } catch (final JGetException exception) {
            System.err.println("Exception : \"" + exception.getMessage() + '\"');
        }
    }
}
