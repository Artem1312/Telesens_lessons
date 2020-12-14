package com.academy.telesens.lesson_06.Operator.home_task.CustomDateTime;

import java.util.Objects;

public class CustomDateTimeExt extends CustomDateTime{
    //Поля
    private int ms = 0;

    //Конструкторы
    public CustomDateTimeExt() {
    }

    public CustomDateTimeExt(int year,
                             int month,
                             int day,
                             int hour,
                             int minute,
                             int second,
                             int ms) {
        super(year, month, day, hour, minute, second);
        setYear(year);
        setMonth(month);
        setDay(day);
        this.ms = ms;
    }

    public CustomDateTimeExt(CustomDateTimeExt customDateTimeExt) {
        //CustomDateTimeExt(CustomDateTimeExt customDateTimeExt)копирования
        setYear(customDateTimeExt.getYear());
        setMonth(customDateTimeExt.getMonth());
        setDay(customDateTimeExt.getDay());
        setHour(customDateTimeExt.getHour());
        setMinute(customDateTimeExt.getMinute());
        setSecond(customDateTimeExt.getSecond());
        setMs(customDateTimeExt.getMs());
    }


    //set/get
    public void setMs(int ms) {
        this.ms = ms;
    }

    public int getMs() {
        return ms;
    }

    @Override
    public String toString() {
        return "CustomDateTimeExt{" +
                "ms=" + ms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomDateTimeExt that = (CustomDateTimeExt) o;
        return ms == that.ms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ms);
    }

    @Override
    public String getFormattedDate() {

        String date;
        date = String.format("%02d.%02d.%04d %s %02d:%02d:%02d.%03d",
                getDay(),getMonth(), getYear(),nameOfDay(),
                getHour(),getMinute(),getSecond(),getMs());

        System.out.println(date);
        return date;
    }
}
