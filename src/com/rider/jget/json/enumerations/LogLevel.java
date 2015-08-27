/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rider.jget.json.enumerations;

/**
 *
 * @author Ciaron Rider
 */
public enum LogLevel {

    /**
     *
     */
    INFO("INFO"),

    /**
     *
     */
    WARNING("WARNING"),

    /**
     *
     */
    ERROR("ERROR"),

    /**
     *
     */
    DETAIL("DETAIL"),

    /**
     *
     */
    DEBUG("DEBUG"),

    /**
     *
     */
    UNKNOWN("DEBUG");

    /**
     * The string version of this log level
     */
    private final String stringValue;

    /**
     * Private constructor for this class. Used to set the string value of the log level
     *
     * @param stringValue The string value to set
     */
    private LogLevel(final String stringValue) {
        this.stringValue = stringValue;
    }
    
    /**
     * Get the corresponding log level for a string
     * @param stringValue The string to look up
     * @return The corresponding log level
     */
    public static LogLevel getLogLevel(final String stringValue) {
        LogLevel returnVal = UNKNOWN;

        for (final LogLevel logLevel : LogLevel.values()) {
            if (logLevel.toString().equals(stringValue)) {
                returnVal = logLevel;

                break;
            }
        }

        return returnVal;
    }

    /**
     * Gets the string value for this command. Used in the json request
     *
     * @return The string value
     */
    public String getStringValue() {
        return stringValue;
    }   
}
