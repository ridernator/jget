package com.rider.jget.json.types;

import com.rider.jget.json.enumerations.LogLevel;

/**
 * Return value from the <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22log%22">log</a> operation
 *
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22log%22#return-value">here</a>
 */
public class Log {
    /**
     * ID of log-entry.
     */
    private int ID;

    /**
     * Class of log-entry, one of the following strings: INFO, WARNING, ERROR, DEBUG.
     */
    private String Kind;

    /**
     * Time in C/Unix format (number of seconds since 00:00:00 UTC, January 1, 1970).
     */
    private int Time;

    /**
     * Log-message.
     */
    private String Text;

    /**
     *
     * @return
     */
    public int getTime() {
        return Time;
    }

    /**
     *
     * @return
     */
    public String getText() {
        return Text;
    }

    /**
     *
     * @return
     */
    public LogLevel getKind() {
        return LogLevel.getLogLevel(Kind);
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }
    
    @Override
    public String toString(){
        final StringBuilder builder = new StringBuilder();
        
        builder.append("ID   : ").append(getID()).append('\n');
        builder.append("Kind : ").append(getKind()).append('\n');
        builder.append("Time : ").append(getTime()).append('\n');
        builder.append("Text : ").append(getText()).append('\n');
        
        return builder.toString();
    }
}
