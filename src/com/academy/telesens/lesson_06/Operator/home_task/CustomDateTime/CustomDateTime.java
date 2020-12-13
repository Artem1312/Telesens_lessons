package com.academy.telesens.lesson_06.Operator.home_task.CustomDateTime;

import com.academy.telesens.lesson_05.home_task.CustomeDate.CustomDate;
import java.util.Objects;

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
        super(year,month,day);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

//    public CustomDateTime(CustomDateTime dateTime){
//        //- CustomDateTime(CustomDateTime dateTime)копирования
//    }

    //set/get
    public void setHour(int hour) {
        if(validate(hour,this.minute,this.second)){
            this.hour = hour;
        } else {
            System.out.println("Вы ввели неккоректно количество часов");
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
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
        if(validate(this.hour,this.minute,second)){
            this.second = second;
        } else {
            System.out.println("Вы ввели неккоректно количество секунд");
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

    /*Переопределить методы:toString // отображает дату и время 25.01.2017 15:05:35  */
    @Override
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
/*
		- использовать метод validate(...)
			при попытке изменть инициализировать класс с помощью конструктора
 */
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


////-* реализовать метод addSeconds(int seconds), который добавляет указанное кол-во секунд к текущей дате
    public void addSeconds(int seconds){
        int secondsInDayBefore = this.hour*3600+this.minute*60+this.second;
        int temp = secondsInDayBefore + seconds;
        // day = 86400 s
        // hour = 3600 s

        int tempS;
        int tempM;
        int tempH;
        int countDay;

        if (temp>=86400){ //когда указали количество секунд более чем в одном дне
            //int tempDay = getDay();
            countDay = temp/86400;
            for(int i =0;i<countDay;i++){
                nextDay();
            }
            tempS = temp%86400;
            setHour(tempS/3600);
            setMinute(((temp-(tempS/3600)*3600))/60);
            setSecond(((temp-(tempS/3600)*3600))%60);
        } else if(temp<86400 && temp >= 3600){ // количество сек больше чем в 1 часу но меньше чем в 1 сутках
            tempH = temp/3600;
            for(int j =0;j<tempH;j++){
                nextHour();
            }
            tempS = temp%3600;
            //setHour(tempS/3600);
            setMinute(((temp-(tempS/3600)*3600))/60);
            setSecond(((temp-(tempS/3600)*3600))%60);
        } else if (temp<3600 && temp >=60){
            tempM = temp/60;
            for(int k=0;k<tempM;k++){
                nextMinute();
            }
            tempS = temp%60;
            setSecond(tempS);
        } else {
            setSecond(temp);
        }
    }
}
