/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rider.jget.exceptions;

/**
 *
 * @author rider
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
