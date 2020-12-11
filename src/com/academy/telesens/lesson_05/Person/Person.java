package com.academy.telesens.lesson_05.Person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public Person(){

    }

    public Person (String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void set(String firstName, String lastName, int age, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public void getProfile(){
        System.out.println(String.format("Имя: %s, Фамилия: %s Возраст: %d Пол: %s", firstName,lastName, age, gender));
    }
}
