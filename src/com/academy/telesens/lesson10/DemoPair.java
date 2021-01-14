package com.academy.telesens.lesson10;

import com.academy.telesens.Person.Person;

public class DemoPair {
    public static void main(String[] args) {
        Pair pair = new Pair(10, "String");
        int n = (int) pair.getFirst();
        String str = (String) pair.getSecond();
        System.out.println("Pair" + n +"-> "+ str);

        Pair pair2 = new Pair("String", 10);
        int n2 = (int) pair.getFirst();
        System.out.println("Pair2 " + n +"-> "+ str);


        Person person = new Person();
        Pair pair3 = new Pair(5, person);
        System.out.println("Pair3 " + n +"-> "+ str);
    }

}
