package com.academy.telesens.lesson_05.home_task.CustomeDate;

public class DemoCustomDate {
    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        customDate.setDay(12);
        customDate.setMonth(12);
        customDate.setYear(2020);

        customDate.getFormattedDate();
        customDate.validate(12,12,2020);

    }
}
