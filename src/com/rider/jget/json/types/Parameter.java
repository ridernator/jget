package com.rider.jget.json.types;

/**
 *
 * @author rider
 */
public class Parameter {
    private String Name;

    private String Value;

    public Parameter(final String name,
                     final String value) {
        Name = name;
        Value = value;
    }

    public String getName() {
        return Name;
    }

    public String getValue() {
        return Value;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

}
