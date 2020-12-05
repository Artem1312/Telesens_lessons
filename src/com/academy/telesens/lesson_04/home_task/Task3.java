package com.academy.telesens.lesson_04.home_task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
    3) Напишите программу, которая:
	- считывает строку
	- считывает подстроку
	- выводит исходные строку и подстроку и выводит кол-во вхождений строки в подстроку
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String subText = scanner.nextLine();

        System.out.println("Вы ввели строку: "+ text);
        System.out.println("Вы ввели подстроку: "+ subText);
        String temp;
        int count = 0;

        for(int i=0; i<text.length();i++){
            if(i+subText.length() <= text.length()){
                temp = text.substring(i,i+subText.length());
            }else break;

            //System.out.println(temp);
            if(temp.equals(subText)){
                count++;
            } else continue;
        }
        System.out.println(count);
    }
}
