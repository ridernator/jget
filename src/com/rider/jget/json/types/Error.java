package com.rider.jget.json.types;

/**
 *
 * @author Ciaron Rider
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
    
    @Override
    public String toString(){
        final StringBuilder builder = new StringBuilder();
        
        builder.append("Name    : ").append(getName()).append('\n');
        builder.append("Code    : ").append(getCode()).append('\n');
        builder.append("Message : ").append(getMessage()).append('\n');
        
        return builder.toString();
    }
}
