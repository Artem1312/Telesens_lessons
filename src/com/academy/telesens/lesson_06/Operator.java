package com.academy.telesens.lesson_06;

public class Operator {
    //поля
    private String name;
    private String address;

    //конструкторы
    public Operator() {
    }

    public Operator(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //setter getter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
