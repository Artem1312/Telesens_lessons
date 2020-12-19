package com.academy.telesens.lesson_07;

import com.academy.telesens.lesson_03.DemoArray;

import java.util.Arrays;

public class DayOfWeekDemo {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        DayOfWeek[] dayOfWeek1 = DayOfWeek.values();
        dayOfWeek.ordinal();
        System.out.println(Arrays.toString(dayOfWeek1));
        dayOfWeek.next(0);
        dayOfWeek.before(1);
    }
}
