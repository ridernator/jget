package com.rider.jget.json.types;

/**
 *
 * @author rider
 */
public class Error {
    private String name;

    private long code;

    private String message;

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
