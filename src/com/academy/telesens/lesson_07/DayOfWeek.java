package com.academy.telesens.lesson_07;

import java.util.Arrays;

public enum DayOfWeek {
    /*


2) a) Создать перечисление "Формат Даты" (DateFormat), в котором определить несколько форматов, например:
		- 	RU 			Россия						DD.MM.YYYY					24.01.2011
		- 	USA 		США							MM-DD-YYYY					01-24-2011
		-	ENG			Международный английский	DD-MM-YYYY					24-01-2011
		- 	UK			Великобритания				DD/MM/YYYY					24/01/2011
		-* 	CUSTOM		Пользовательский			DD <Название месяца> YYYYг	25 января 2011г

	b) Модифицировать класс CustomDate из предыдущего занятия, для фозможности отображения даты в заданном формате:
		- public String getFormattedDate() {} // возвращает дату в формате по умолчанию - RU: 24.01.2011
		- public String getFormattedDate((DateFormat format){} // возвращает дату в заданном формате по образцу из задания а)

3) 	а) Создать перечисление "Формат времени" (TimeFormat), в котором определить следующие форматы:
		- H12		12 часовой			HH:MM:SS (am|pm)	09:23:45am, 09:23:45pm
		- H24		24 часовой			HH:MM:SS			09:23:45,	21:23:45

	б)Модифицировать класс CustomDateTime из пред. занятия(ий), для возможности отображения времени в заданном формате:
		- public String getFormattedDate() {} // возвращает дату и время в формате по умолчанию: 24.01.2011	21:23:45
		- public String getFormattedDate(DateFormat dateFormat, TimeFormat format) {} // возвращает дату и время в заданном форматах
     */

    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String ru;

    DayOfWeek(String ru){ this.ru = ru;}

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public static void next(int today){
        DayOfWeek[] dayOfWeek1 = DayOfWeek.values();
        if(today+1>=8){
            System.out.println(Arrays.toString(new DayOfWeek[]{dayOfWeek1[0]}));
        } else {
            System.out.println(Arrays.toString(new DayOfWeek[]{dayOfWeek1[today]}));
        }
    }
    public static void before(int today){
        DayOfWeek[] dayOfWeeks2 = DayOfWeek.values();
        if(today == 1){
            System.out.println(Arrays.toString(new DayOfWeek[]{dayOfWeeks2[6]}));
        } else {
            System.out.println(Arrays.toString(new DayOfWeek[]{dayOfWeeks2[today-2]}));
        }

    }


}
