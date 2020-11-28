package com.academy.telesens.lesson_02;

public class Demo2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
        int result = n1/n2;
        System.out.println(result);
        //System.out.println(1/0);
        System.out.println(10%2);
        System.out.println(10%3);
        System.out.println(1%3);

        int value =1;
        value++;
        System.out.println(value);

        int val = 1;
        ++val;
        System.out.println(val);

        //сравнение
        System.out.println(2==2);
        System.out.println(2!=3);
        System.out.println(2>=3);

        System.out.println("********");
        int n = 2;
        System.out.println(n<3);
        System.out.println(n>1);
        System.out.println((n<3) && (n>1));  //&& - and истина когда выполняються оба условия
        System.out.println(n>2 && n< 3);
        System.out.println(n>2 || n< 3);        //  || - or или истина если одно из условий истина
        System.out.println(!true);              //  ! - not отрицание


        int m = 2;
        m*=3; //6
        final int z = 10; //защита от изменения переменной


    }
}
