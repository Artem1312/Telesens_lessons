package com.academy.telesens.lesson_09.from_materials;

public class Demo {
    public static void main(String[] args) {
        double x = 1;
        double y = 0;
        Calculator calculator = new Calculator();
        double z = 0;
        try {
            z = calculator.div(x,y);
        } catch (DivisionByZero exc) {
            System.err.println("Error division");
        } catch (Exception e) {
            System.err.println("Unknown error");
        }
    }
}
