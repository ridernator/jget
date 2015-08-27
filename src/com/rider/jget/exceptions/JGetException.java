package com.rider.jget.exceptions;

import java.util.logging.Logger;

/**
 *
 * @author Ciaron Rider
 */
public class JGetException extends Throwable {
    private final String message;

    private final long code;

    private final String name;

    /**
     *
     * @param error
     */
    public JGetException(final com.rider.jget.json.types.Error error) {
        this.message = error.getMessage();
        this.code = error.getCode();
        this.name = error.getName();
    }

    /**
     *
     * @param message
     * @param code
     * @param name
     */
    public JGetException(final String message, final long code, final String name) {
        this.message = message;
        this.code = code;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return message;
    }

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
    public String getName() {
        return name;
    }
    private static final Logger LOG = Logger.getLogger(JGetException.class.getName());
}
