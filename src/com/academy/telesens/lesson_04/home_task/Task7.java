package com.academy.telesens.lesson_04.home_task;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая определяет, является ли строка палиндромом.
        Палиндром - это строка, которая одинаково читается одинаково в обоих направлениях
        (пример: "мадам" - палиндром, "адам" - не палиндром).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели строку: "+text);

        //переворачиваем строку
        String revers = "";
        for(int i=text.length()-1;i>=0;i--){
            revers+=text.charAt(i);
        }
        //избавляемся от пробелов и прочих символов в строке
        String tempText ="";
        String tempRevers ="";
        for(int j=0;j<text.length();j++){
            if(text.charAt(j)!=' ' || text.charAt(j)!=',' || text.charAt(j)!='.'|| text.charAt(j)!='!' || text.charAt(j)!='?'){
                tempText+=text.charAt(j);
            }
        }
        for(int k=0;k<revers.length();k++){
            if(revers.charAt(k)!=' ' || revers.charAt(k)!=',' || revers.charAt(k)!='.'|| revers.charAt(k)!='!' || revers.charAt(k)!='?'){
                tempRevers+=revers.charAt(k);
            }
        }
        //сравниваем
        if(tempText.equals(tempRevers)){
            System.out.println("Строка являеться палиндромом: ");
            System.out.println(revers);
        }else{
            System.out.println("Строка не являеться палиндромом: ");
            System.out.println(revers);
        }
    }
}
