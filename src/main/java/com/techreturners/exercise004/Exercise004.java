package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        this.dateTime = LocalDateTime.of(
                date.getYear(),
                date.getMonth(),
                date.getDayOfMonth(),
                0,
                0,
                0,
                0);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = LocalDateTime.of(
                dateTime.getYear(),
                dateTime.getMonth(),
                dateTime.getDayOfMonth(),
                dateTime.getHour(),
                dateTime.getMinute(),
                dateTime.getSecond(),
                dateTime.getNano());
    }

    public LocalDateTime getDateTime() {
        return this.dateTime.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTimeDifference(int minusYears, int minusMonths,
                                               int minusWeeks, int minusDays,
                                               int minusHours, int minusMinutes,
                                               int minusSeconds, int minusNanoSeconds) {

        return this.dateTime.minusYears(minusYears).minusMonths(minusMonths)
                .minusWeeks(minusWeeks).minusDays(minusDays)
                .minusHours(minusHours).minusMinutes(minusMinutes)
                .minusSeconds(minusSeconds).minusNanos(minusNanoSeconds);

    }
}
