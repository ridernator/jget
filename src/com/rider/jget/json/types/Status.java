package com.rider.jget.json.types;

import com.rider.jget.utilities.Utils;
import java.util.ArrayList;
import java.util.List;

/**
 * Return value from the <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22status%22">status</a> operation
 *
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22status%22#return-value">here</a>
 */
public class Status {
    /**
     * Remaining size of all entries in download queue, in bytes. This field contains the low 32-bits of 64-bit value
     */
    private int RemainingSizeLo;

    /**
     * Remaining size of all entries in download queue, in bytes. This field contains the high 32-bits of 64-bit value
     */
    private int RemainingSizeHi;

    /**
     * Remaining size of all entries in download queue, in megabytes.
     */
    private int RemainingSizeMB;

    /**
     * Remaining size of entries with FORCE priority, in bytes. This field contains the low 32-bits of 64-bit value
     */
    private int ForcedSizeLo;

    /**
     * Remaining size of entries with FORCE priority, in bytes. This field contains the high 32-bits of 64-bit value
     */
    private int ForcedSizeHi;

    /**
     * Remaining size of entries with FORCE priority, in megabytes.
     */
    private int ForcedSizeMB;

    /**
     * Amount of data downloaded since server start, in bytes. This field contains the low 32-bits of 64-bit value
     */
    private int DownloadedSizeLo;

    /**
     * Amount of data downloaded since server start, in bytes. This field contains the high 32-bits of 64-bit value
     */
    private int DownloadedSizeHi;

    /**
     * Amount of data downloaded since server start, in megabytes.
     */
    private int DownloadedSizeMB;

    /**
     * v14.0 Current usage of article cache, in bytes. This field contains the low 32-bits of 64-bit value
     */
    private int ArticleCacheLo;

    /**
     * v14.0 Current usage of article cache, in bytes. This field contains the high 32-bits of 64-bit value
     */
    private int ArticleCacheHi;

    /**
     * v14.0 Current usage of article cache, in megabytes.
     */
    private int ArticleCacheMB;

    /**
     * Current download speed, in Bytes per Second.
     */
    private int DownloadRate;

    /**
     * Average download speed since server start, in Bytes per Second.
     */
    private int AverageDownloadRate;

    /**
     * Current download limit, in Bytes per Second. The limit can be changed via method "rate". Be aware of different scales used by the method rate (Kilobytes)
     * and this field (Bytes).
     */
    private int DownloadLimit;

    /**
     * Number of threads running. It includes all threads, created by the program, not only download-threads.
     */
    private int ThreadCount;

    /**
     * Number of Par-Jobs or Post-processing script jobs in the post-processing queue (including current file).
     */
    private int PostJobCount;

    /**
     * v12.0 Deprecated, use PostJobCount instead.
     */
    private int ParJobCount;

    /**
     * Number of URLs in the URL-queue (including current file).
     */
    private int UrlCount;

    /**
     * Server uptime in seconds.
     */
    private int UpTimeSec;

    /**
     * Server download time in seconds.
     */
    private int DownloadTimeSec;

    /**
     * "False" - there are currently downloads running, "True" - no downloads in progress (server paused or all jobs completed).
     */
    private boolean ServerStandBy;

    /**
     * "True" if download queue is paused via first pause register (soft-pause).
     */
    private boolean DownloadPaused;

    /**
     * v13.0 Deprecated, use DownloadPaused instead.
     */
    private boolean Download2Paused;

    /**
     * v12.0 Deprecated, use DownloadPaused instead.
     */
    private boolean ServerPaused;

    /**
     * "True" if post-processor queue is currently in paused-state.
     */
    private boolean PostPaused;

    /**
     * "True" if the scanning of incoming nzb-directory is currently in paused-state.
     */
    private boolean ScanPaused;

    /**
     * Current time on computer running NZBGet. Time is in C/Unix format (number of seconds since 00:00:00 UTC, January 1, 1970).
     */
    private int ServerTime;

    /**
     * Time to resume if set with method "scheduleresume". Time is in C/Unix format.
     */
    private int ResumeTime;

    /**
     * "True" if any RSS feed is being fetched right now.
     */
    private boolean FeedActive;

    /**
     * Free disk space on 'DestDir', in bytes. This field contains the low 32-bits of 64-bit value
     */
    private int FreeDiskSpaceLo;

    /**
     * Free disk space on 'DestDir', in bytes. This field contains the high 32-bits of 64-bit value
     */
    private int FreeDiskSpaceHi;

    /**
     * Free disk space on 'DestDir', in megabytes.
     */
    private int FreeDiskSpaceMB;

    /**
     * Status of news-servers, array of structures with following fields
     */
    private List<NewsServer> NewsServers;

    public long getArticleCacheBytes() {
        return Utils.intsToLong(ArticleCacheHi, ArticleCacheLo);
    }

    public int getArticleCacheMB() {
        return ArticleCacheMB;
    }

    public int getAverageDownloadRate() {
        return AverageDownloadRate;
    }

    public int getDownloadLimit() {
        return DownloadLimit;
    }

    public int getDownloadRate() {
        return DownloadRate;
    }

    public int getDownloadTimeSec() {
        return DownloadTimeSec;
    }

    public long getDownloadedSizeBytes() {
        return Utils.intsToLong(DownloadedSizeHi, DownloadedSizeLo);
    }

    public int getDownloadedSizeMB() {
        return DownloadedSizeMB;
    }

    public long getForcedSizeBytes() {
        return Utils.intsToLong(ForcedSizeHi, ForcedSizeLo);
    }

    public int getForcedSizeMB() {
        return ForcedSizeMB;
    }

    public long getFreeDiskSpaceBytes() {
        return Utils.intsToLong(FreeDiskSpaceHi, FreeDiskSpaceLo);
    }

    public int getFreeDiskSpaceMB() {
        return FreeDiskSpaceMB;
    }

    public List<NewsServer> getNewsServers() {
        if (NewsServers == null) {
            NewsServers = new ArrayList<>();
        }

        return NewsServers;
    }

    @Deprecated
    public int getParJobCount() {
        return ParJobCount;
    }

    public int getPostJobCount() {
        return PostJobCount;
    }

    public long getRemainingSizeBytes() {
        return Utils.intsToLong(RemainingSizeHi, RemainingSizeLo);
    }

    public int getRemainingSizeMB() {
        return RemainingSizeMB;
    }

    public int getResumeTime() {
        return ResumeTime;
    }

    public int getServerTime() {
        return ServerTime;
    }

    public int getThreadCount() {
        return ThreadCount;
    }

    public int getUpTimeSec() {
        return UpTimeSec;
    }

    public int getUrlCount() {
        return UrlCount;
    }

    @Deprecated
    public boolean isDownload2Paused() {
        return Download2Paused;
    }

    public boolean isDownloadPaused() {
        return DownloadPaused;
    }

    public boolean isFeedActive() {
        return FeedActive;
    }

    public boolean isPostPaused() {
        return PostPaused;
    }

    public boolean isScanPaused() {
        return ScanPaused;
    }

    @Deprecated
    public boolean isServerPaused() {
        return ServerPaused;
    }

    public boolean isServerStandBy() {
        return ServerStandBy;
    }
    
    @Override
    public String toString(){
        final StringBuilder builder = new StringBuilder();
        
        builder.append("RemainingSizeBytes   : ").append(getRemainingSizeBytes()).append("(RemainingSizeLo : ").append(RemainingSizeLo).append(", RemainingSizeHi : ").append(RemainingSizeHi).append(")\n");
        builder.append("RemainingSizeMB : ").append(getRemainingSizeMB()).append('\n');
        builder.append("ForcedSizeBytes : ").append(getForcedSizeBytes()).append("(ForcedSizeLo : ").append(ForcedSizeLo).append(", ForcedSizeHi : ").append(ForcedSizeHi).append(")\n");
        builder.append("ForcedSizeMB : ").append(getForcedSizeMB()).append('\n');
        builder.append("DownloadedSizeBytes : ").append(getDownloadedSizeBytes()).append("(DownloadedSizeLo : ").append(DownloadedSizeLo).append(", DownloadedSizeHi : ").append(DownloadedSizeHi).append(")\n");
        builder.append("ForcedSizeMB : ").append(getForcedSizeMB()).append('\n');
        builder.append("ArticleCacheBytes : ").append(getArticleCacheBytes()).append("(ArticleCacheLo : ").append(ArticleCacheLo).append(", ArticleCacheHi : ").append(ArticleCacheHi).append(")\n");
        builder.append("ArticleCacheMB : ").append(getArticleCacheMB()).append('\n');
        builder.append("DownloadRate : ").append(getDownloadRate()).append('\n');
        builder.append("AverageDownloadRate : ").append(getAverageDownloadRate()).append('\n');
        builder.append("DownloadLimit : ").append(getDownloadLimit()).append('\n');
        builder.append("ThreadCount : ").append(getThreadCount()).append('\n');
        builder.append("PostJobCount : ").append(getPostJobCount()).append('\n');
        builder.append("ParJobCount : ").append(getParJobCount()).append('\n');
        builder.append("UrlCount : ").append(getUrlCount()).append('\n');
        builder.append("UpTimeSec : ").append(getUpTimeSec()).append('\n');
        builder.append("DownloadTimeSec : ").append(getDownloadTimeSec()).append('\n');
        builder.append("ServerStandBy : ").append(isServerStandBy()).append('\n');
        builder.append("DownloadPaused : ").append(isDownloadPaused()).append('\n');
        builder.append("Download2Paused : ").append(isDownload2Paused()).append('\n');
        builder.append("ServerPaused : ").append(isServerPaused()).append('\n');
        builder.append("PostPaused : ").append(isPostPaused()).append('\n');
        builder.append("ScanPaused : ").append(isScanPaused()).append('\n');
        builder.append("ServerTime : ").append(getServerTime()).append('\n');
        builder.append("ResumeTime : ").append(getResumeTime()).append('\n');
        builder.append("FeedActive : ").append(isFeedActive()).append('\n');
        builder.append("FreeDiskSpaceBytes : ").append(getFreeDiskSpaceBytes()).append("(FreeDiskSpaceLo : ").append(FreeDiskSpaceLo).append(", FreeDiskSpaceHi : ").append(FreeDiskSpaceHi).append(")\n");
        builder.append("FreeDiskSpaceMB : ").append(getFreeDiskSpaceMB()).append('\n');
        builder.append("NewsServers : ").append('\n');
        
        for (final NewsServer newsServer : getNewsServers()) {
            builder.append(newsServer.toString());
        }
        
        return builder.toString();
    }
}
