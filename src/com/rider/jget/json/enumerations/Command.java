package com.rider.jget.json.enumerations;

/**
 *
 * @author rider
 */
public enum Command {
    /**
     * Move files to Offset relative to the current position in queue.
     */
    FileMoveOffset("FileMoveOffset"),
    /**
     * Move files to top of queue.
     */
    FileMoveTop("FileMoveTop"),
    /**
     * Move files to bottom of queue.
     */
    FileMoveBottom("FileMoveBottom"),
    /**
     * Pause files.
     */
    FilePause("FilePause"),
    /**
     * Resume (unpause) files.
     */
    FileResume("FileResume"),
    /**
     * Delete files.
     */
    FileDelete("FileDelete"),
    /**
     * Pause only pars (does not affect other files).
     */
    FilePauseAllPars("FilePauseAllPars"),
    /**
     * Pause only pars, except main par-file (does not affect other files).
     */
    FilePauseExtraPars("FilePauseExtraPars"),
    /**
     * Deprecated - Use GroupSetPriority instead.
     */
    @Deprecated
    FileSetPriority("FileSetPriority"),
    /**
     * Reorder files in the group. The list of IDs may include files only from one group.
     */
    FileReorder("FileReorder"),
    /**
     * Split nzb-file. The list of IDs contains the files to move into new download item.
     */
    FileSplit("FileSplit"),
    /**
     * Move groups to Offset relative to the current position in queue.
     */
    GroupMoveOffset("GroupMoveOffset"),
    /**
     * Move groups to top of queue.
     */
    GroupMoveTop("GroupMoveTop"),
    /**
     * Move groups to bottom of queue.
     */
    GroupMoveBottom("GroupMoveBottom"),
    /**
     * Pause groups.
     */
    GroupPause("GroupPause"),
    /**
     * Resume (unpause) groups.
     */
    GroupResume("GroupResume"),
    /**
     * Delete groups and put to history.
     */
    GroupDelete("GroupDelete"),
    /**
     * Delete groups, put to history and mark as duplicate.
     */
    GroupDupeDelete("GroupDupeDelete"),
    /**
     * Delete groups without adding to history.
     */
    GroupFinalDelete("GroupFinalDelete"),
    /**
     * Pause only pars (does not affect other files).
     */
    GroupPauseAllPars("GroupPauseAllPars"),
    /**
     * Pause only pars, except main par-file (does not affect other files).
     */
    GroupPauseExtraPars("GroupPauseExtraPars"),
    /**
     * Set priority for all files in group. EditText contains priority value.
     */
    GroupSetPriority("GroupSetPriority"),
    /**
     * Set category for group. EditText contains category name.
     */
    GroupSetCategory("GroupSetCategory"),
    /**
     * Set or change category for groups and reassign pp-params according to category settings. EditText contains category name.
     */
    GroupApplyCategory("GroupApplyCategory"),
    /**
     * Merge groups.
     */
    GroupMerge("GroupMerge"),
    /**
     * Set post-processing parameter for group. EditText contains string in form of Paramname=Paramvalue.
     */
    GroupSetParameter("GroupSetParameter"),
    /**
     * Rename group. EditText contains new name.
     */
    GroupSetName("GroupSetName"),
    /**
     * Set duplicate key. EditText contains duplicate key. See RSS.
     */
    GroupSetDupeKey("GroupSetDupeKey"),
    /**
     * Set duplicate score. EditText contains duplicate score. See RSS.
     */
    GroupSetDupeScore("GroupSetDupeScore"),
    /**
     * Set duplicate mode. EditText contains one of SCORE, ALL, FORCE. See RSS.
     */
    GroupSetDupeMode("GroupSetDupeMode"),
    /**
     * v15.0 - Sort selected or all groups. Parameter EditText must be one of: name, priority, category, size, left; add character + or - to sort to explicitly
     * define ascending or descending order (for example name-); if none of these characters is used the auto-mode is active: the items are sorted in ascending
     * order first, if nothing changed - they are sorted again in descending order. Parameter IDs contains the list of groups to sort; pass empty array to sort
     * all groups.
     */
    GroupSort("GroupSort"),
    /**
     * v13.0 Deprecated - Use GroupMoveOffset instead.
     */
    @Deprecated
    PostMoveOffset("PostMoveOffset"),
    /**
     * v13.0 - Use GroupMoveTop instead.
     */
    PostMoveTop("PostMoveTop"),
    /**
     * v13.0 Deprecated - Use GroupMoveBottom instead.
     */
    @Deprecated
    PostMoveBottom("PostMoveBottom"),
    /**
     * Delete post-jobs.
     */
    PostDelete("PostDelete"),
    /**
     * Hide history items (mark as hidden).
     */
    HistoryDelete("HistoryDelete"),
    /**
     * Delete history items.
     */
    HistoryFinalDelete("HistoryFinalDelete"),
    /**
     * Return history items back to download queue.
     */
    HistoryReturn("HistoryReturn"),
    /**
     * Post-process history items again.
     */
    HistoryProcess("HistoryProcess"),
    /**
     * Move history items back to download queue for redownload.
     */
    HistoryRedownload("HistoryRedownload"),
    /**
     * v15.0 Rename history item. EditText contains new name.
     */
    HistorySetName("HistorySetName"),
    /**
     * v15.0 Set category for history item. EditText contains category name.
     */
    HistorySetCategory("HistorySetCategory"),
    /**
     * Set post-processing parameter for history items. EditText contains string in form of Paramname=Paramvalue.
     */
    HistorySetParameter("HistorySetParameter"),
    /**
     * Set duplicate key. EditText contains duplicate key. See RSS.
     */
    HistorySetDupeKey("HistorySetDupeKey"),
    /**
     * Set duplicate score. EditText contains duplicate score. See RSS.
     */
    HistorySetDupeScore("HistorySetDupeScore"),
    /**
     * Set duplicate mode. EditText contains one of SCORE, ALL, FORCE. See RSS.
     */
    HistorySetDupeMode("HistorySetDupeMode"),
    /**
     * Set use as duplicate backup-flag for history items. EditText contains 0 or 1. See RSS.
     */
    HistorySetDupeBackup("HistorySetDupeBackup"),
    /**
     * Mark history item as bad (and download other duplicate). See RSS.
     */
    HistoryMarkBad("HistoryMarkBad"),
    /**
     * Mark history item as good. See RSS.
     */
    HistoryMarkGood("HistoryMarkGood"),
    /**
     * v15.0 Mark history item as success. See RSS.
     */
    HistoryMarkSuccess("HistoryMarkSuccess");
    
    /**
     * The string version of this command
     */
    private final String stringValue;

    /**
     * Private constructor for this class. Used to set the string value of the command
     * @param stringValue The string value to set
     */
    private Command(final String stringValue) {
        this.stringValue = stringValue;
    }
    
    /**
     * Gets the string value for this command. Used in the json request
     * @return The string value
     */
    public String getStringValue() {
        return stringValue;
    }
}
