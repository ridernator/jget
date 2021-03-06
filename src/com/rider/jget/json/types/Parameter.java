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

    /**
     *
     * @param name
     * @param value
     */
    public Parameter(final String name,
                     final String value) {
        Name = name;
        Value = value;
    }

    /**
     *
     */
    public Parameter() {
        // Do nothing
    }

    /**
     *
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return Value;
    }

    /**
     *
     * @param Name
     */
    public void setName(final String Name) {
        this.Name = Name;
    }

    /**
     *
     * @param Value
     */
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
