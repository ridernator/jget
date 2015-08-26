package com.rider.jget.operations;

import com.rider.jget.json.RequestSender;
import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.operations.Config;
import com.rider.jget.json.operations.ConfigTemplates;
import com.rider.jget.json.operations.LoadConfig;
import com.rider.jget.json.operations.SaveConfig;
import com.rider.jget.json.reponses.ConfigResponse;
import com.rider.jget.json.reponses.ConfigTemplatesResponse;
import com.rider.jget.json.reponses.LoadConfigResponse;
import com.rider.jget.json.reponses.SaveConfigResponse;
import com.rider.jget.json.types.ConfigTemplate;
import com.rider.jget.json.types.Parameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of nzbget's Configuration methods
 *
 * @author Ciaron Rider
 * @see <a href="https://github.com/nzbget/nzbget/wiki/API#configuration">here</a>
 */
public class Configuration {
    private Configuration() {
        // Do nothing
    }

    /**
     * Returns current configuration loaded into program. Please note that the configuration file on disk may differ from the loaded configuration. This may
     * occur if the configuration file on disk was changed after the program was launched or the program may become some options passed via command line.
     *
     * Remarks
     *
     * For options with predefined possible values (yes/no, etc.) the values are returned always in lower case.
     *
     * If the option has variable references (e. g. "${MainDir}/dst") the returned value has all variables substituted (e. g. "/home/user/downloads/dst").
     *
     * @return This method returns array of structures with following fields: Name (string) - Option name. Value (string) - Option value.
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22config%22">here</a>
     */
    public static List<Parameter> config() throws JGetException {
        final ConfigResponse response = (ConfigResponse) RequestSender.sendRequest(Config.OPERATION_NAME, null, ConfigResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getConfig();
    }

    /**
     * Reads configuration file from the disk.
     *
     * Remarks
     *
     * The option value is returned exactly as it is stored in the configuration file. For example it may contain variable references (e. g. "${MainDir}/dst").
     *
     * @return This method returns array of structures with following fields: Name (string) - Option name. Value (string) - Option value.
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22loadconfig%22">here</a>
     */
    public static List<Parameter> loadConfig() throws JGetException {
        final LoadConfigResponse response = (LoadConfigResponse) RequestSender.sendRequest(LoadConfig.OPERATION_NAME, null, LoadConfigResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getLoadedConfig();
    }

    /**
     * Saves configuration file to the disk.
     *
     * @param options Options - array of structs : Name (string) - Option name. Value (string) - Option value
     * @return "True" on success or "False" on failure.
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22saveconfig%22">here</a>
     */
    public static boolean saveConfig(final List<Parameter> options) throws JGetException {
        final SaveConfigResponse response = (SaveConfigResponse) RequestSender.sendRequest(SaveConfig.OPERATION_NAME, options, SaveConfigResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSaved();
    }

    /**
     * Returns NZBGet configuration file template and also extracts configuration sections from all post-processing files. This information is for example used
     * by web-interface to build settings page or page "Postprocess" in download details dialog.
     *
     * @param loadFromDisk v15.0 "True" - load templates from disk, "False" - give templates loaded on program start.
     * @return An array of ConfigTemplates
     * @throws JGetException If there is any problem
     * @see <a href="https://github.com/nzbget/nzbget/wiki/API-Method-%22configtemplates%22">here</a>
     */
    public static List<ConfigTemplate> configTemplates(final boolean loadFromDisk) throws JGetException {
        final ConfigTemplatesResponse response = (ConfigTemplatesResponse) RequestSender.sendRequest(ConfigTemplates.OPERATION_NAME, loadFromDisk, ConfigTemplatesResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.getConfigTemplates();
    }
}
