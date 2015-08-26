package com.rider.jget.operations;

import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.RequestSender;
import com.rider.jget.json.reponses.StatusResponse;
import com.rider.jget.json.types.Status;

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

}
