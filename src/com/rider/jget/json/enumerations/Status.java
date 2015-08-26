package com.rider.jget.json.enumerations;

/**
 * Status of a group
 *
 * @author Ciaron Rider
 */
public enum Status {
    /**
     * Queued for download
     */
    QUEUED,
    /**
     * Paused
     */
    PAUSED,
    /**
     * Item is being downloaded
     */
    DOWNLOADING,
    /**
     * Nzb-file is being fetched from URL (Kind=URL)
     */
    FETCHING,
    /**
     * Queued for post-processing (completely downloaded)
     */
    PP_QUEUED,
    /**
     * Stage of par-check
     */
    LOADING_PARS,
    /**
     * Stage of par-check
     */
    VERIFYING_SOURCES,
    /**
     * Stage of par-check
     */
    REPAIRING,
    /**
     * Stage of par-check
     */
    VERIFYING_REPAIRED,
    /**
     * Processed by par-renamer
     */
    RENAMING,
    /**
     * Being unpacked
     */
    UNPACKING,
    /**
     * Moving files from intermediate directory into destination directory
     */
    MOVING,
    /**
     * Executing post-processing script
     */
    EXECUTING_SCRIPT,
    /**
     * Post-processing is finished, the item is about to be moved to history
     */
    PP_FINISHED

}
