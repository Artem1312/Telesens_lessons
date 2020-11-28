package com.academy.telesens.lesson_02.home_task;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a, b, c, n ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        n = scanner.nextInt();

        if((n/10 <= 9) || (n/10 >= 100)){
            System.out.print("Вы ввели не трехзначное число");
        } else {
            a = (n/100)%10;
            b = (n/10)%10;
            c = n%10;
            System.out.println("Исходное число: "+n);
            System.out.println("Сумма чисел: "+(a+b+c));
        }
    }
}
