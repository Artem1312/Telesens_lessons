package com.academy.telesens.lesson_02.home_task;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int reg = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int num = scanner.nextInt();
        System.out.println("Вы ввели: "+num);

        while (num/10 != 0){
            sum+=num%10;
            num/=10;
            reg+=1;
        }
        sum+=num;

        System.out.println("Разрядность данного числа: "+reg);
        System.out.println("Сумма цифр введенного числа: "+sum);
    }
}
