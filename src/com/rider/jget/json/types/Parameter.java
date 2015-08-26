package com.rider.jget.json.types;

/**
 * Return value from the <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22config%22">config</a> operation
 *
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22config%22#return-value">here</a>
 */
public class Parameter {
    /**
     * Option name.
     */
    private String Name;

    /**
     * Option value
     */
    private String Value;

    public Parameter(final String name,
                     final String value) {
        Name = name;
        Value = value;
    }

    public Parameter() {
        // Do nothing
    }

    public String getName() {
        return Name;
    }

    public String getValue() {
        return Value;
    }

    public void setName(final String Name) {
        this.Name = Name;
    }

    public void setValue(final String Value) {
        this.Value = Value;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        
        builder.append("Name  : ").append(getName()).append('\n');
        builder.append("Value : ").append(getValue()).append('\n');
        
        return builder.toString();
    }
}
