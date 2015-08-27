package com.rider.jget.json.types;

/**
 *
 * @author Ciaron Rider
 */
public class Error {
    private String name;

    private long code;

    private String message;

    /**
     *
     * @return
     */
    public long getCode() {
        return code;
    }

    /**
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append("Name    : ").append(getName()).append('\n');
        builder.append("Code    : ").append(getCode()).append('\n');
        builder.append("Message : ").append(getMessage()).append('\n');

        return builder.toString();
    }
}
