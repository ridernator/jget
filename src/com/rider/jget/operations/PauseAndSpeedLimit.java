package com.rider.jget.operations;

import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.RequestSender;
import com.rider.jget.json.operations.PauseDownload;
import com.rider.jget.json.operations.PausePost;
import com.rider.jget.json.operations.PauseScan;
import com.rider.jget.json.operations.Rate;
import com.rider.jget.json.operations.ResumeDownload;
import com.rider.jget.json.operations.ResumePost;
import com.rider.jget.json.operations.ResumeScan;
import com.rider.jget.json.reponses.PauseDownloadResponse;
import com.rider.jget.json.reponses.PausePostResponse;
import com.rider.jget.json.reponses.PauseScanResponse;
import com.rider.jget.json.reponses.RateResponse;
import com.rider.jget.json.reponses.ResumeDownloadResponse;
import com.rider.jget.json.reponses.ResumePostResponse;
import com.rider.jget.json.reponses.ResumeScanResponse;

/**
 * Implementation of nzbget's Pause and Speed Limit methods
 *
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API#pause-and-speed-limit">here</a>
 */
public class PauseAndSpeedLimit {
    private PauseAndSpeedLimit() {
        // Do nothing
    }

    /**
     * Set download speed limit.
     *
     * @param limit New download speed limit in KBytes/second. Value "0" disables speed throttling.
     * @return Usually "True" but may return "False" if parameter Limit was out of range.
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22rate%22">here</a>
     */
    public static boolean rate(final int limit) throws JGetException {
        final RateResponse response = (RateResponse) RequestSender.sendRequest(Rate.OPERATION_NAME, limit, RateResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }

    /**
     * Pause download queue.
     *
     * @return Always "True"
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22pausedownload%22">here</a>
     */
    public static boolean pauseDownload() throws JGetException {
        final PauseDownloadResponse response = (PauseDownloadResponse) RequestSender.sendRequest(PauseDownload.OPERATION_NAME, null, PauseDownloadResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }

    /**
     * Resume (previously paused) download queue.
     *
     * @return Always "True"
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22resumedownload%22">here</a>
     */
    public static boolean resumeDownload() throws JGetException {
        final ResumeDownloadResponse response = (ResumeDownloadResponse) RequestSender.sendRequest(ResumeDownload.OPERATION_NAME, null, ResumeDownloadResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }

    /**
     * Pause post-processing.
     *
     * @return Always "True"
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22pausepost%22">here</a>
     */
    public static boolean pausePost() throws JGetException {
        final PausePostResponse response = (PausePostResponse) RequestSender.sendRequest(PausePost.OPERATION_NAME, null, PausePostResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }

    /**
     * Resume (previously paused) post-processing.
     *
     * @return Always "True"
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22resumepost%22">here</a>
     */
    public static boolean resumePost() throws JGetException {
        final ResumePostResponse response = (ResumePostResponse) RequestSender.sendRequest(ResumePost.OPERATION_NAME, null, ResumePostResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }

    /**
     * Pause scanning of directory with incoming nzb-files (option NzbDir).
     *
     * @return Always "True"
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22pausescan%22">here</a>
     */
    public static boolean pauseScan() throws JGetException {
        final PauseScanResponse response = (PauseScanResponse) RequestSender.sendRequest(PauseScan.OPERATION_NAME, null, PauseScanResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }

    /**
     * Resume (previously paused) scanning of directory with incoming nzb-files (option NzbDir).
     *
     * @return Always "True"
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22resumescan%22">here</a>
     */
    public static boolean resumeScan() throws JGetException {
        final ResumeScanResponse response = (ResumeScanResponse) RequestSender.sendRequest(ResumeScan.OPERATION_NAME, null, ResumeScanResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }
}
