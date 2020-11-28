package com.academy.telesens.lesson_02.home_task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int q = 0, w = 0;
        Scanner scanner = new Scanner(System.in);

        if(args.length==0){   //на тот случай если аргументы небыли переданы при запуске (повторно запрашиваем в процессе выполнения)
            System.out.print("Введите первое натуральное число: ");
            q += scanner.nextInt();
            System.out.print("Введите второе натуральное число: ");
            w += scanner.nextInt();

        }else if(args.length==1){               //был передан один агрумент
            System.out.println("Был передан только один аргумент");

        }else if (args.length==2){              //было передано два агрумента
            q += Integer.parseInt(args[0]);
            w += Integer.parseInt(args[1]);

            // учитываем тот случай если аргументов было передано более двух
        }else System.out.println("Вы ввели более двух аргументов. Принимаем только 2 аргумента");

        System.out.println("q ="+ q);
        System.out.println("w ="+ w);
        System.out.println("q/w ="+ (q/w));
        System.out.println("остаток q/w ="+ (q%w));
    }
}
