package me.suff.mc.angels.utils;

import java.util.Calendar;

/* Created by Craig on 26/02/2021 */
public class DateChecker {

    private static final Calendar calendar = Calendar.getInstance();

    public static void tick() {
        calendar.setTimeInMillis(System.currentTimeMillis());
    }

    public static boolean isXmas() {
        return calendar.get(Calendar.MONTH) == Calendar.DECEMBER;
    }

}
