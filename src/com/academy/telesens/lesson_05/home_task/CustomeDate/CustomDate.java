package com.academy.telesens.lesson_05.home_task.CustomeDate;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if(validateDay(day)){
            this.day = day;
        } else {
            System.out.println("Вы ввели несуществующий день месяца");
        }
    }

    public void setMonth(int month) {

        if(validateMonth(month)){
            this.month = month;
        } else {
            System.out.println("Вы ввели несуществующий месяц");
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getFormattedDate(){

        String nameOfDay="";
        switch (dayOfWeek(this.day,this.month,this.year)){
            case 1:
                nameOfDay = "Понедельник";
                break;
            case 2:
                nameOfDay = "Вторник";
                break;
            case 3:
                nameOfDay = "Среда";
                break;
            case 4:
                nameOfDay = "Четверг";
                break;
            case 5:
                nameOfDay = "Пятница";
                break;
            case 6:
                nameOfDay = "Суббота";
                break;
            case 7:
                nameOfDay = "Воскресенье";
                break;
        }
        String date;
        //date = ""+getDay()+"."+getMonth()+"."+getYear()+" "+nameOfDay;
        date = String.format("%02d.%02d.%04d %s",getDay(),getMonth(),getYear(),nameOfDay);

        //System.out.println(String.format("%02d. %02d. %04d %s",getDay(),getMonth(),getYear(),nameOfDay));
        System.out.println(date);
        return date;
    }

    static boolean validate(int day, int month, int year){

        boolean result;
        boolean existDay;
        boolean existMonth;
        boolean existYear = true;
        boolean leapYear;

        //проверка на высокосный год
        if (year%400 == 0 ){
            leapYear = true;
        } else if (year%100 == 0){
            leapYear = false;
        } else if (year%4 == 0){
            leapYear = true;
        } else {
            leapYear = false;
        }

        //проверка что введен правильный месяц
        if(month>0 && month<13){
            existMonth = true;
        } else existMonth = false;

        //существующий день
        if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)&&(day>0&&day<=31)){
            existDay = true;
        } else if((month==4 || month==6 || month==9 || month==11)&&(day>0&&day<=30)){
            existDay = true;
        } else if(month==2 && leapYear==true &&(day>0&&day<=29)){
            existDay = true;
        } else if(month==2 && leapYear==false &&(day>0&&day<=28)){
            existDay = true;
        } else existDay = false;

        if(existDay&&existMonth&&existYear){
            result = true;
        } else result = false;

        //System.out.println(result);
        return result;
    }

    //(для проверки дня, считаем что дней не может быть более 31)
    static boolean validateDay(int day){

        boolean result;
        boolean existDay;
        boolean existMonth=true;
        boolean existYear = true;

        if(day>0&&day<=31){
            existDay=true;
        } else {
            existDay=false;
        }

        if(existDay&&existMonth&&existYear){
            result = true;
        } else result = false;

        //System.out.println(result);
        return result;
    }

    static boolean validateMonth(int month){

        boolean result;
        boolean existDay=true;
        boolean existMonth;
        boolean existYear = true;

        //проверка что введен правильный месяц
        if(month>0 && month<13){
            existMonth = true;
        } else existMonth = false;

        if(existDay&&existMonth&&existYear){
            result = true;
        } else result = false;

        //System.out.println(result);
        return result;
    }

    static int dayOfWeek(int day, int month, int year){
        //алгоритм https://unotices.com/page-answer.php?id=46039
        int dayOfWeek; //понедельника - 0 вторника - 1 и т.д.
        if(month<=2){
            year=-1;
            day+=3;
        }
        dayOfWeek = 1 + (day+year+(year/4)-(year/100)+(year/400)+(31*month + 10)/12)%7;
        return dayOfWeek;
    }
}
