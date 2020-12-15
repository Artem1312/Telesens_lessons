package com.academy.telesens.lesson_06.Operator.home_task.CustomDateTime;

import com.academy.telesens.lesson_05.home_task.CustomeDate.CustomDate;
import java.util.Objects;
import java.util.Scanner;

public class CustomDateTime extends CustomDate {
    //поля
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    public boolean isTimeFormat12;

    //конструкторы
    public CustomDateTime() {
    }

    public CustomDateTime(int year,
                          int month,
                          int day,
                          int hour,
                          int minute,
                          int second) {
        super.setYear(year);
        super.setMonth(month);
        super.setDay(day);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomDateTime(CustomDateTime dateTime){ //- CustomDateTime(CustomDateTime dateTime)копирования

        setYear(dateTime.getYear());
        setMonth(dateTime.getMonth());
        setDay(dateTime.getDay());
        setHour(dateTime.getHour());
        setMinute(dateTime.getMinute());
        setSecond(dateTime.getSecond());
    }

    //set/get
    public void setHour(int hour) {
        if(validate(hour,this.minute,this.second)){
            this.hour = hour;
        } else {
            System.out.println("Вы ввели неккоректно количество часов");
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(validate(this.hour,minute,this.second)){
            this.minute = minute;
        } else {
            System.out.println("Вы ввели неккоректно количество минут");
            this.minute = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if(validate(this.hour,this.minute,second)){
            this.second = second;
        } else {
            System.out.println("Вы ввели неккоректно количество секунд");
            this.second = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String getFormattedDate() {

        String date;
        date = String.format("%02d.%02d.%04d %s %02d:%02d:%02d",
                getDay(),getMonth(), getYear(),nameOfDay(),
                getHour(),getMinute(),getSecond());

        System.out.println(date);
        return date;
    }

    public String getFormattedDate(boolean isTimeFormat12) {

        String date;
        if(isTimeFormat12){
            if(hour<=12){
                date = String.format("%02d.%02d.%04d %s %d:%02d:%02d a.m.",
                        getDay(),getMonth(), getYear(),nameOfDay(),
                        getHour(),getMinute(),getSecond());
            }else{
                date = String.format("%02d.%02d.%04d %s %d:%02d:%02d p.m.",
                        getDay(),getMonth(), getYear(),nameOfDay(),
                        getHour()-12,getMinute(),getSecond());
            }
        }else{
            date = String.format("%02d.%02d.%04d %s %02d:%02d:%02d",
                    getDay(),getMonth(), getYear(),nameOfDay(),
                    getHour(),getMinute(),getSecond());
        }

        System.out.println(date);
        return date;
    }

    @Override   /*Переопределить методы:toString // отображает дату и время 25.01.2017 15:05:35  */
    public String toString() {
        return "CustomDateTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", isTimeFormat12=" + isTimeFormat12 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDateTime that = (CustomDateTime) o;
        return hour == that.hour &&
                minute == that.minute &&
                second == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }

    // использовать метод validate(...) при попытке изменть инициализировать класс с помощью конструктора
    static boolean validate (int hour, int minute, int second){
        boolean existHour;
        boolean existMinute;
        boolean existSecond;
        boolean existTime;

        if(hour<24 && hour>=0){ existHour = true; } else { existHour = false;}

        if(minute<60 && minute>=0){ existMinute = true; } else { existMinute = false;}

        if(second<60 && second>=0){ existSecond = true; } else { existSecond = false;}

        if(existHour && existMinute && existSecond){ existTime = true; } else { existTime = false;}

        return  existTime;
    }

    public void nextSecond(){
        int temp = this.second;
        temp++;
        if(temp == 60){
            setSecond(0);
            nextMinute();
        } else { setSecond(temp);}
    }

    public void nextMinute() {
        int temp = this.minute;
        temp++;
        if(temp == 60){
            setMinute(0);
            nextHour();
        } else { setMinute(temp);}
    }

    public void nextHour(){
        int temp = this.hour;
        temp++;
        if(temp == 24){
            setHour(0);
            setDay(getDay()+1);
        } else {setHour(temp);}
    }

    public void addSeconds(int seconds){
        int secondsInDayBefore = this.hour*3600+this.minute*60+this.second; //текущее количество секунд
        int temp = secondsInDayBefore + seconds;   //определяем на какое количество сек надо увеличить текущую дату от 0:00:00
        // day = 86400 s // hour = 3600 s

        int tempS;
        int tempM;
        int tempH;

        if (temp>=86400){                           //когда указали количество секунд более чем в одном дне

            for(int d=0; d<(temp/86400);d++){
                nextDay();
            }
            tempH = (temp%86400)/3600;
            setHour(tempH);
            tempM = ((temp%86400)/3600)/60;
            setMinute(tempM);
            setSecond(temp%60);

        } else if(temp<86400 && temp > 3599){       // количество сек больше чем в 1 часу но меньше чем в 1 сутках
            tempH = temp/3600;
            setHour(tempH);
            tempS = temp%3600;                      // остаток секунд меньше одного часа
            setMinute(tempS/60);
            setSecond(temp%60);
        } else if (temp<3600 && temp >=60){         //количество секунд от 60 до 1 часа
            setMinute(temp/60);
            setSecond(temp%60);
        } else {                                    //меньше 60 сек
            setSecond(temp);
        }
    }

    public void checkTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время в формате чч:мм:сс ");
        String userTime = scanner.nextLine();

        String[] arr = userTime.split("\\D+");
        int[] time = new int[3];
        for(int i=0;i<3;i++){
            time[i] = Integer.parseInt(arr[i]);
        }

        int hour = time[0];
        int minute = time[1];
        int second = time[2];

        if(validate(hour,minute,second)){
            System.out.println("Вы ввели действительное время");
        } else {
            System.out.println("Вы ввели не действительное время");
        }
    }
}
