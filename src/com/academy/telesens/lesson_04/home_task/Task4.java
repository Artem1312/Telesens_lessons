package com.academy.telesens.lesson_04.home_task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая:
	    считывает с клавиатуры строку
	- удаляет из строки все цифры
	     выводит исходную строку
	- выводит преобразованную строку
	- выводит список удаленных символов

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели строку: "+text);


    }
}
