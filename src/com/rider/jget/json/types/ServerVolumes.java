package com.rider.jget.json.types;

import com.rider.jget.utilities.Utils;
import java.util.List;

/**
 *
 * @author Ciaron Rider
 */
public class ServerVolumes {
    private int ServerID;

    private int DataTime;

    private int FirstDay;

    private int TotalSizeLo;

    private int TotalSizeHi;

    private int TotalSizeMB;

    private int CustomSizeLo;

    private int CustomSizeHi;

    private int CustomSizeMB;

    private int CustomTime;

    private int SecSlot;

    private int MinSlot;

    private int HourSlot;

    private int DaySlot;

    private List<BytesPerSecond> BytesPerSeconds;

    public List<BytesPerSecond> getBytesPerSeconds() {
        return BytesPerSeconds;
    }

    public long getCustomSizeBytes() {
        return Utils.intsToLong(CustomSizeHi, CustomSizeLo);
    }

    public int getCustomSizeMB() {
        return CustomSizeMB;
    }

    public int getCustomTime() {
        return CustomTime;
    }

    public int getDataTime() {
        return DataTime;
    }

    public int getDaySlot() {
        return DaySlot;
    }

    public int getFirstDay() {
        return FirstDay;
    }

    public int getHourSlot() {
        return HourSlot;
    }

    public int getMinSlot() {
        return MinSlot;
    }

    public int getSecSlot() {
        return SecSlot;
    }

    public int getServerID() {
        return ServerID;
    }

    public long getTotalSizeBytes() {
        return Utils.intsToLong(TotalSizeHi, TotalSizeLo);
    }

    public int getTotalSizeMB() {
        return TotalSizeMB;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append("ServerID  : ").append(getServerID()).append('\n');
        builder.append("DataTime : ").append(getDataTime()).append('\n');
        builder.append("FirstDay : ").append(getFirstDay()).append('\n');
        builder.append("TotalSizeBytes : ").append(getTotalSizeBytes()).append("(TotalSizeLo : ").append(TotalSizeLo).append(", TotalSizeHi : ").append(TotalSizeHi).append(")\n");
        builder.append("TotalSizeMB : ").append(getTotalSizeMB()).append('\n');
        builder.append("CustomSizeBytes : ").append(getCustomSizeBytes()).append("(CustomSizeLo : ").append(CustomSizeLo).append(", CustomSizeHi : ").append(CustomSizeHi).append(")\n");
        builder.append("CustomSizeMB : ").append(getCustomSizeMB()).append('\n');
        builder.append("CustomTime : ").append(getCustomTime()).append('\n');
        builder.append("SecSlot : ").append(getSecSlot()).append('\n');
        builder.append("MinSlot : ").append(getMinSlot()).append('\n');
        builder.append("HourSlot : ").append(getHourSlot()).append('\n');
        builder.append("DaySlot : ").append(getDaySlot()).append('\n');
        builder.append("BytesPerSeconds : ").append('\n');

        for (final BytesPerSecond bytesPerSecond : getBytesPerSeconds()) {
            builder.append(bytesPerSecond.toString());
        }

        return builder.toString();
    }
}
