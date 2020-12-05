package com.academy.telesens.lesson_04.home_task;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая:
	    считывает строку
        выводит исходную строку на экран
	- выводит кол-во символов латиницы
	- выводит кол-во символов кириллицы
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели строку: "+text);
    }
}
