package com.rider.jget.globals;

/**
 *
 * @author Ciaron Rider
 */
public class GlobalSettings {
    private static String username = "username";

    private static String password = "password";

    private static String server = "server";

    private static short port = 6789;

    /**
     *
     * @return
     */
    public static String getUsername() {
        synchronized (GlobalSettings.class) {
            return username;
        }
    }

    /**
     *
     * @return
     */
    public static String getPassword() {
        synchronized (GlobalSettings.class) {
            return password;
        }
    }

    /**
     *
     * @return
     */
    public static short getPort() {
        synchronized (GlobalSettings.class) {
            return port;
        }
    }

    /**
     *
     * @return
     */
    public static String getServer() {
        synchronized (GlobalSettings.class) {
            return server;
        }
    }

    /**
     *
     * @param username
     */
    public static void setUsername(final String username) {
        synchronized (GlobalSettings.class) {
            GlobalSettings.username = username;
        }
    }

    /**
     *
     * @param password
     */
    public static void setPassword(final String password) {
        synchronized (GlobalSettings.class) {
            GlobalSettings.password = password;
        }
    }

    /**
     *
     * @param port
     */
    public static void setPort(final short port) {
        synchronized (GlobalSettings.class) {
            GlobalSettings.port = port;
        }
    }

    /**
     *
     * @param server
     */
    public static void setServer(final String server) {
        synchronized (GlobalSettings.class) {
            GlobalSettings.server = server;
        }
    }
}
