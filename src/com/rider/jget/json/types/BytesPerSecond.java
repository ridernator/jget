package com.rider.jget.json.types;

import com.rider.jget.utilities.Utils;

/**
 *
 * @author Ciaron Rider
 */
public class BytesPerSecond {
    private int SizeLo;

    private int SizeHi;

    private int SizeMB;

    /**
     *
     * @return
     */
    public long getSizeBytes() {
        return Utils.intsToLong(SizeHi, SizeLo);
    }

    /**
     *
     * @return
     */
    public int getSizeMB() {
        return SizeMB;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append("SizeBytes : ").append(getSizeBytes()).append("(SizeLo : ").append(SizeLo).append(", SizeHi : ").append(SizeHi).append(")\n");
        builder.append("SizeMB    : ").append(getSizeMB()).append('\n');

        return builder.toString();
    }
}
