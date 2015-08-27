package com.rider.jget;

import com.rider.jget.globals.GlobalSettings;
import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.RequestSender;
import com.rider.jget.json.enumerations.LogLevel;
import com.rider.jget.json.operations.Config;
import com.rider.jget.json.types.Parameter;
import com.rider.jget.json.types.ServerVolumes;
import com.rider.jget.operations.Configuration;
import com.rider.jget.operations.PauseAndSpeedLimit;
import com.rider.jget.operations.ProgramControl;
import com.rider.jget.operations.StatusLoggingAndStatistics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ciaron Rider
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) throws JGetException, InterruptedException {
        GlobalSettings.setServer("alfie");
        GlobalSettings.setPort((short) 6789);
        GlobalSettings.setUsername("rider");
        GlobalSettings.setPassword("*******");

        try {
            System.out.println("Version : " + ProgramControl.version());
        } catch (final JGetException exception) {
            System.err.println("Exception : \"" + exception.getMessage() + '\"');
        }
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
//        List<Parameter> params = new ArrayList<>();
//         params.add(new Parameter("Bob", "Builder"));
//                
//        try {
//            System.out.println(Configuration.saveConfig(params)? "Parameters saved" : "Parameters not saved");
//        } catch (final JGetException exception) {
//            System.err.println("Exception : \"" + exception.getMessage() + '\"');
//        }
//
//        try {
//            System.out.println(PauseAndSpeedLimit.rate(50) ? "Rate set to 50" : "Rate setting didn't work");
//        } catch (final JGetException exception) {
//            System.err.println("Exception : \"" + exception.getMessage() + '\"');
//        }
//        
//        Thread.sleep(5000);
//
//        try {
//            System.out.println(PauseAndSpeedLimit.rate(0) ? "Rate set to unlimited" : "Rate setting didn't work");
//        } catch (final JGetException exception) {
//            System.err.println("Exception : \"" + exception.getMessage() + '\"');
//        }

        for (final LogLevel level : LogLevel.values()) {
            if (StatusLoggingAndStatistics.writeLog(level, "Test message at "+level.getStringValue()+" level")) {
                System.out.println("logged");
            } else {
                System.out.println("failed to log");
            }
        }
        
        List<ServerVolumes> serverVolumes = StatusLoggingAndStatistics.serverVolumes();
        
        for (ServerVolumes sv : serverVolumes) {
            System.out.println(sv);
        }
    }
}
