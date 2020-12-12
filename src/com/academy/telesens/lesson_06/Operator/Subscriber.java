package com.academy.telesens.lesson_06.Operator;

public class Subscriber  extends Person{
    private String phoneNumber;
    private Operator operator;

    //констркутор
    public Subscriber(){

    }

    public Subscriber(String firstName,
                       String lastName,
                       Integer age,
                       Character gender,
                       String phoneNumber,
                       Operator operator){

        super(firstName,lastName,age,gender); // конструктор базового класа должна быть первой иструкцией
        //setFirstName(firstName); //1 способ
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    //set/get
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Operator getOperator() {
        return operator;
    }


    //метод with (для красоты)
    public Subscriber withFirstName(String firstName){
        super.firstName = firstName;
        return this;
    }

    public Subscriber withLastName(String lastName){
        super.lastName = lastName;
        return this;
    }

    public Subscriber withAge(int age) {
        super.age = age;
        return this;
    }

    @Override
    public String getProfile(){
        //return String.format("Имя: %s, Фамилия: %s Возраст: %d Пол: %s номер %s оператор %s", firstName,lastName, age, gender,phoneNumber, operator.getName());
        return super.getProfile() + String.format(" PhoneNumber: %s\n Operator: %s\n",phoneNumber, operator.getName());
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", operator=" + operator +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
