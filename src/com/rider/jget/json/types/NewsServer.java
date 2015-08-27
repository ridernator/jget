package com.rider.jget.json.types;

/**
 * Status of a news server
 * 
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22status%22#return-value">here</a>
 */
public class NewsServer {
    /**
     * Server number in the configuration file. For example "1" for server defined by options "Server1.Host", "Server1.Port", etc.
     */
    private int ID;

    /**
     * True if server is in active state (enabled). Active doesn't mean that the data is being downloaded from the server right now. This only means the server
     * can be used for download (if there are any download jobs).
     */
    private boolean Active;

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @return
     */
    public boolean isActive() {
        return Active;
    }
    
    @Override
    public String toString(){
        final StringBuilder builder = new StringBuilder();
        
        builder.append("ID     : ").append(getID()).append('\n');
        builder.append("Active : ").append(isActive()).append('\n');
        
        return builder.toString();
    }
}
