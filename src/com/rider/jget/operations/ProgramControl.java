package com.rider.jget.operations;

import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.RequestSender;
import com.rider.jget.json.operations.Reload;
import com.rider.jget.json.operations.Shutdown;
import com.rider.jget.json.operations.Version;
import com.rider.jget.json.reponses.ReloadResponse;
import com.rider.jget.json.reponses.ShutdownResponse;
import com.rider.jget.json.reponses.VersionResponse;

/**
 * Implementation of nzbget's Program Control methods
 *
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API#program-control">here</a>
 */
public class ProgramControl {
    private ProgramControl() {
        // Do nothing
    }

    /**
     * Request the version-string of the program.
     *
     * @return Version string
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22version%22">here</a>
     */
    public static String version() throws JGetException {
        final VersionResponse response = (VersionResponse) RequestSender.sendRequest(Version.OPERATION_NAME, null, VersionResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getVersion();
    }

    /**
     * Shutdown the program.
     *
     * @return Always "True".
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22shutdown%22">here</a>
     */
    public static boolean shutdown() throws JGetException {
        final ShutdownResponse response = (ShutdownResponse) RequestSender.sendRequest(Shutdown.OPERATION_NAME, null, ShutdownResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isShutdown();
    }

    /**
     * Stop all activities and reinitialize the program. This method must be called after changing of program options for them to have effect.
     *
     * @return Always "True".
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22reload%22">here</a>
     */
    public static boolean reload() throws JGetException {
        final ReloadResponse response = (ReloadResponse) RequestSender.sendRequest(Reload.OPERATION_NAME, null, ReloadResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isReloaded();
    }
}
