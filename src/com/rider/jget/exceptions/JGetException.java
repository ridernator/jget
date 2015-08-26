package com.rider.jget.exceptions;

/**
 *
 * @author Ciaron Rider
 */
public class JGetException extends Throwable {
    private final String message;

    private final long code;

    private final String name;

    public JGetException(final com.rider.jget.json.types.Error error) {
        this.message = error.getMessage();
        this.code = error.getCode();
        this.name = error.getName();
    }

    public JGetException(final String message, final long code, final String name) {
        this.message = message;
        this.code = code;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
