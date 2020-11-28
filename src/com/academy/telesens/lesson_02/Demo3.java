package com.academy.telesens.lesson_02;

public class Demo3 {
    public static void main(String[] args) {
        int age = 90;
        if (age<=18){
            System.out.println("Несовершеннолетний");
        }else if(age<=89){
            System.out.println("взрослый");
        }else{
            System.out.println("долгожитель");
        }
    }
}
