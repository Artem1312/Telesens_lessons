package com.academy.telesens.lesson_02.home_task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш вес: ");
        int weight = scanner.nextInt();

        double weight2 = (double) (weight*17)/100;

        System.out.println("Ваш вес на Земле: "+weight+" кг.");
        System.out.println("Ваш вес на Луне: "+weight2+" кг.");
    }
}
