package com.academy.telesens.lesson_04.home_task;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая:
        считывает строку
	- меняет местами порядок символов (напр. "abcd" => "dcba")
	    выводит исходную строку
	- выводит перевернутую строку
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели строку: "+text);
    }
}
