package com.rider.jget.utilities;

/**
 * Collection of helpful utilities
 *
 * @author Ciaron Rider
 */
public class Utils {

    /**
     *
     * @param highBits
     * @param lowBits
     * @return
     */
    public static long intsToLong(final int highBits,
                                  final int lowBits) {
        return (((long) highBits) << 32) | (lowBits & 0xffff_ffffL);
    }
}
