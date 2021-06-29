package com.evilbas.rslengine.util;

public class CombatUtil {
    public static Long getExpCap(Integer level) {
        return (long) (Math.pow((double) level, 1.5) * 20);
    }

    public static Long getMonsterExpDrop(Integer level) {
        return (long) (Math.pow((double) level, 1.1) * 5);
    }
}
