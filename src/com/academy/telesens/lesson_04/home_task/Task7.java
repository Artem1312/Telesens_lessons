package com.academy.telesens.lesson_04.home_task;

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
    }
}
