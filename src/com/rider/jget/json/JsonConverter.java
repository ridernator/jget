package com.rider.jget.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.util.Date;

/**
 * Useful class to convert to and from Json In this example we use Google gson
 */
public class JsonConverter {
    /**
     * Gson object
     */
    private static final Gson gson = new GsonBuilder().create();

    /**
     * This method deserializes the specified Json into an object of the
     * specified class.
     *
     */
    public static <T> T convertFromJson(final String toConvert,
                                        final Class<T> clazz) {
        return gson.fromJson(toConvert, clazz);
    }

    /**
     * This method deserializes the specified Json into an object of the
     * specified Type.
     *
     */
    public static <T> T convertFromJson(final String toConvert,
                                        final Type typeOfT) {
        return gson.fromJson(toConvert, typeOfT);
    }

    /**
     * This method serializes the specified object into its equivalent Json
     * representation.
     */
    public static String convertToJson(final Object toConvert) {
        return gson.toJson(toConvert);
    }
}
