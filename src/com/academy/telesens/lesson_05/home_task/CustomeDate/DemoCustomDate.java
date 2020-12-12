package com.academy.telesens.lesson_05.home_task.CustomeDate;

public class DemoCustomDate {
    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        customDate.setDay(1);
        customDate.setMonth(12);
        customDate.setYear(2020);

        customDate.getFormattedDate();
        customDate.validate(1,12,2020);

    }
}
