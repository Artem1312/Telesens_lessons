package com.academy.telesens.lesson_06.Operator.home_task.CustomDateTime;

public class DemoCustomDateTimeExt {
    public static void main(String[] args) {
        //конструкторы
        CustomDateTimeExt customDateTimeExt = new CustomDateTimeExt();
        CustomDateTimeExt customDateTimeExt1 = new CustomDateTimeExt(2020, 12, 15, 15, 45, 25, 899);
        //customDateTimeExt1.getFormattedDate();
        CustomDateTimeExt customDateTimeExt2 = new CustomDateTimeExt(customDateTimeExt1 );

        customDateTimeExt.getFormattedDate();
        customDateTimeExt.setMs(123);
        customDateTimeExt.getFormattedDate();
        //- метод toString()
        System.out.println("****Проверки****");
        customDateTimeExt.getFormattedDate();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt2.getFormattedDate();
        //метод equals()
        System.out.println("equals()");
        System.out.println(customDateTimeExt2.equals(customDateTimeExt1));
        System.out.println(customDateTimeExt2.equals(customDateTimeExt));
        System.out.println("next...()");
        customDateTimeExt1.nextSecond();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextMinute();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextHour();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextDay();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextMonth();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextYear();
        customDateTimeExt1.getFormattedDate();

        customDateTimeExt.checkData();
        customDateTimeExt.checkTime();

    }
}
