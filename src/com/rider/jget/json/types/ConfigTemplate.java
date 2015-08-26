package com.rider.jget.json.types;

/**
 * Return value from the <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22configtemplates%22">configtemplates</a> operation
 *
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22configtemplates%22#return-value">here</a>
 */
public class ConfigTemplate {
    /**
     * Post-processing script name. For example "videosort/VideoSort.py". This field is empty in the first record, which holds the config template of the
     * program itself.
     */
    private String Name;

    /**
     * Nice script name ready for displaying. For example "VideoSort".
     */
    private String DisplayName;

    /**
     * "True" for post-processing scripts.
     */
    private boolean PostScript;

    /**
     * "True" for scan scripts.
     */
    private boolean ScanScript;

    /**
     * "True" for queue scripts.
     */
    private boolean QueueScript;

    /**
     * "True" for scheduler scripts.
     */
    private boolean SchedulerScript;

    /**
     * Content of the configuration template (multiple lines).
     */
    private String Template;

    public String getDisplayName() {
        return DisplayName;
    }

    public String getName() {
        return Name;
    }

    public String getTemplate() {
        return Template;
    }

    public boolean isPostScript() {
        return PostScript;
    }

    public boolean isQueueScript() {
        return QueueScript;
    }

    public boolean isScanScript() {
        return ScanScript;
    }

    public boolean isSchedulerScript() {
        return SchedulerScript;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append("Name            : ").append(getName()).append('\n');
        builder.append("DisplayName     : ").append(getDisplayName()).append('\n');
        builder.append("PostScript      : ").append(isPostScript()).append('\n');
        builder.append("ScanScript      : ").append(isScanScript()).append('\n');
        builder.append("QueueScript     : ").append(isQueueScript()).append('\n');
        builder.append("SchedulerScript : ").append(isSchedulerScript()).append('\n');
        builder.append("Template        : ").append(getTemplate()).append('\n');

        return builder.toString();
    }
}
