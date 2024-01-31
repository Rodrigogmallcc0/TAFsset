package com.mslogisticaactivo.util;

import java.time.LocalDateTime;

public class Util {
    /**
     * Creates a non-working public static LocalDateTime.
     */
    public static LocalDateTime nonWorking(LocalDateTime date, int days) {
        LocalDateTime nonWorkingDate = date;
        int count = 0;
        while (count < days) {
            nonWorkingDate = nonWorkingDate.plusDays(1);
            if (nonWorkingDate.getDayOfWeek().getValue() < 6) {
                count++;
            }
        }
        return nonWorkingDate;
    }
}
