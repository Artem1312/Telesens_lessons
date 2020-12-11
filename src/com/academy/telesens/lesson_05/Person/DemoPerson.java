package com.academy.telesens.lesson_05.Person;

public class DemoPerson {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Artem");
        person.setLastName("Apukhtin");
        person.setAge(29);
        person.setGender('m');

        person.getProfile();
    }
}
