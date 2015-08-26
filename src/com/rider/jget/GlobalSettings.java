package com.rider.jget;

/**
 *
 * @author Ciaron Rider
 */
public class GlobalSettings {
    private static String username = "username";

    private static String password = "password";

    private static String server = "server";

    private static short port = 6789;

    public static String getUsername() {
        synchronized (GlobalSettings.class) {
            return username;
        }
    }

    public static String getPassword() {
        synchronized (GlobalSettings.class) {
            return password;
        }
    }

    public static short getPort() {
        synchronized (GlobalSettings.class) {
            return port;
        }
    }

    public static String getServer() {
        synchronized (GlobalSettings.class) {
            return server;
        }
    }

    public static void setUsername(final String username) {
        synchronized (GlobalSettings.class) {
            GlobalSettings.username = username;
        }
    }

    public static void setPassword(final String password) {
        synchronized (GlobalSettings.class) {
            GlobalSettings.password = password;
        }
    }

    public static void setPort(final short port) {
        synchronized (GlobalSettings.class) {
            GlobalSettings.port = port;
        }
    }

    public static void setServer(final String server) {
        synchronized (GlobalSettings.class) {
            GlobalSettings.server = server;
        }
    }
}
