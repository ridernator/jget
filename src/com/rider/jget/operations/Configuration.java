package com.rider.jget.operations;

import com.rider.jget.json.RequestSender;
import com.rider.jget.exceptions.JGetException;
import com.rider.jget.json.operations.Config;
import com.rider.jget.json.operations.LoadConfig;
import com.rider.jget.json.operations.SaveConfig;
import com.rider.jget.json.reponses.ConfigResponse;
import com.rider.jget.json.reponses.LoadConfigResponse;
import com.rider.jget.json.reponses.SaveConfigResponse;
import com.rider.jget.json.types.Parameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rider
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
     */
    public static boolean saveConfig(List<Parameter> options) throws JGetException {
        final Map<String, Object> params = new HashMap<>();

        params.put(SaveConfig.PARAM_OPTIONS, options);

        final SaveConfigResponse response = (SaveConfigResponse) RequestSender.sendRequest(SaveConfig.OPERATION_NAME, params, SaveConfigResponse.class);

        if (response.getError() != null) {
            throw new JGetException(response.getError());
        }

        return response.isSaved();
    }
}
