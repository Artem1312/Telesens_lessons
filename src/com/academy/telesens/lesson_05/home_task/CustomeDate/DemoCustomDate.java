package com.academy.telesens.lesson_05.home_task.CustomeDate;

public class DemoCustomDate {
    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        customDate.setDay(32);
        customDate.setMonth(12);
        customDate.setYear(1990);

        customDate.getFormattedDate();
        customDate.validate(28,2,2021);

    }
}
