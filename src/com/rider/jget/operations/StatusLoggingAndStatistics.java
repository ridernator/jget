package com.rider.jget.operations;

import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.RequestSender;
import com.rider.jget.json.enumerations.LogLevel;
import com.rider.jget.json.operations.LoadLog;
import com.rider.jget.json.operations.ResetServerVolumes;
import com.rider.jget.json.operations.WriteLog;
import com.rider.jget.json.reponses.LoadLogResponse;
import com.rider.jget.json.reponses.LogResponse;
import com.rider.jget.json.reponses.ResetServerVolumeResponse;
import com.rider.jget.json.reponses.ServerVolumesResponse;
import com.rider.jget.json.reponses.StatusResponse;
import com.rider.jget.json.reponses.WriteLogResponse;
import com.rider.jget.json.types.Log;
import com.rider.jget.json.types.ServerVolumes;
import com.rider.jget.json.types.Status;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of nzbget's Status, Logging and Statistics methods
 *
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API#status-logging-and-statistics">here</a>
 */
public class StatusLoggingAndStatistics {
    private StatusLoggingAndStatistics() {
        // Do nothing
    }

    /**
     * Request for current status (summary) information.
     *
     * @return Status structure
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22status%22">here</a>
     */
    public static Status status() throws JGetException {
        final StatusResponse response = (StatusResponse) RequestSender.sendRequest(com.rider.jget.json.operations.Status.OPERATION_NAME, null, StatusResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getStatus();
    }

    /**
     * This method returns entries from screen's log-buffer. The size of this buffer is limited and can be set via option LogBufferSize. Which messages should
     * be saved to screen-log and which should be saved to log-file can be set via options DetailTarget, InfoTarget, WarningTarget, ErrorTarget and DebugTarget.
     *
     * TIP: If your application stores log-entries between sub-sequential calls to method log(), the usage of parameter IDFrom is recommended, since it reduces
     * the amount of transferred data.
     *
     * NOTE: only one parameter - either IDFrom or NumberOfEntries - can be specified. The other parameter must be "0".
     *
     * NOTE: if there are no entries for requested criteria, an empty array is returned.
     *
     * @param idFrom The first ID to be returned
     * @param numberOfEntries Number of entries, which should be returned.
     * @return A list of Logs
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22log%22">here</a>
     */
    public static List<Log> log(final int idFrom,
                                final int numberOfEntries) throws JGetException {
        final List<Object> parameters = new ArrayList<>();

        parameters.add(idFrom);
        parameters.add(numberOfEntries);

        final LogResponse response = (LogResponse) RequestSender.sendRequest(com.rider.jget.json.operations.Log.OPERATION_NAME, parameters, LogResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getLogs();
    }

    /**
     * Append log-entry into server's log-file and on-screen log-buffer.
     *
     * @param kind Kind of log-message. Must be one of the following strings: INFO, WARNING, ERROR, DETAIL, DEBUG. Debug-messages are available, only if the
     * program was compiled in debug-mode.
     * @param text Text to be added into log.
     * @return Always "True".
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22writelog%22">here</a>
     */
    public static boolean writeLog(final LogLevel kind,
                                   final String text) throws JGetException {
        final List<Object> parameters = new ArrayList<>();

        parameters.add(kind.getStringValue());
        parameters.add(text);

        final WriteLogResponse response = (WriteLogResponse) RequestSender.sendRequest(WriteLog.OPERATION_NAME, parameters, WriteLogResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }

    /**
     * Loads from disk and returns nzb-log for a specific nzb-file.
     *
     * @param nzbId id of nzb-file.
     * @param idFrom The first ID to be returned
     * @param numberOfEntries Number of entries, which should be returned.
     * @return A list of Logs
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22loadlog%22">here</a>
     */
    public static List<Log> loadLog(final int nzbId,
                                    final int idFrom,
                                    final int numberOfEntries) throws JGetException {
        final List<Object> parameters = new ArrayList<>();

        parameters.add(nzbId);
        parameters.add(idFrom);
        parameters.add(numberOfEntries);

        final LoadLogResponse response = (LoadLogResponse) RequestSender.sendRequest(LoadLog.OPERATION_NAME, parameters, LoadLogResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getLogs();
    }

    /**
     * Returns download volume statistics per news-server.
     *
     * @return TODO
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22servervolumes%22">here</a>
     */
    public static List<ServerVolumes> serverVolumes() throws JGetException {
        final ServerVolumesResponse response = (ServerVolumesResponse) RequestSender.sendRequest(com.rider.jget.json.operations.ServerVolumes.OPERATION_NAME, null, ServerVolumesResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getServerVolumes();
    }

    /**
     * Reset download volume statistics for a specified news-server.
     *
     * @param serverid TODO
     * @param counter TODO
     * @return TODO
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22resetservervolume%22">here</a>
     */
    public static boolean resetServerVolume(final int serverid,
                                            final String counter) throws JGetException {
        final List<Object> parameters = new ArrayList<>();

        parameters.add(serverid);
        parameters.add(counter);

        final ResetServerVolumeResponse response = (ResetServerVolumeResponse) RequestSender.sendRequest(ResetServerVolumes.OPERATION_NAME, parameters, ResetServerVolumeResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSuccess();
    }

}
