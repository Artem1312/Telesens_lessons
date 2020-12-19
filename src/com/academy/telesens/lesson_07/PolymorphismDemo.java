package com.academy.telesens.lesson_07;

import com.academy.telesens.lesson_05.Person.Person;
import com.academy.telesens.lesson_06.Operator.Operator;
import com.academy.telesens.lesson_06.Operator.Subscriber;
import com.academy.telesens.lesson_06.home_task.CustomDateTime.CustomDateTime;

import java.util.Arrays;

public class PolymorphismDemo {
    public static void main(String[] args) {
        CustomDateTime time = new CustomDateTime();
        Long l1 = 23L;
        Integer i1 = 213;

        //l1 = (Long) i1;
        //l1 = i1;
        Object[] arr = {1,"2",3, time};
        Operator operator = new Operator();
        operator.setName("Life");
        System.out.println(Arrays.toString(arr));
        Person subscriber = new Subscriber();
        subscriber.setFirstName("vasa");
        //subscriber.setPhoneNumber("9999");
        subscriber.getProfile();
    }
}
