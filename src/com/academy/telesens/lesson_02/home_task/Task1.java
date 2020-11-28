package com.academy.telesens.lesson_02.home_task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a, b, c, max, min;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        a = scanner.nextInt();
        System.out.print("Введите число 2: ");
        b = scanner.nextInt();
        System.out.print("Введите число 3: ");
        c = scanner.nextInt();

        //находим максимум
        if(a>b){
            if(a>c){
                max = a;
            } else max = c;
        } else if(b>c){
            max = b;
        } else max = c;

        System.out.println("Max = "+ max);

        //находим минимум
        if(a<b && a<c){
            min = a;
        }else if(b<a && b<c){
            min = b;
        }else min = c;

        System.out.println("Min = "+min);
        double avr = (max+min)/2;
        System.out.println("Avr = "+ avr);
    }
}
