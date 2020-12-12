package com.academy.telesens.lesson_06.Operator;

public class Demo {
        public static void main(String[] args) {
        System.out.println(
                String.format("%02d.%02d.%02d")
        );
        //Person
        Operator operator = new Operator("Vodafone", "Kiev");
        Subscriber subscriber = new Subscriber("Иван","Иванов", 25, 'm', "09812312",operator);

        //subscriber.setFirstName("Artem");
        String profile = subscriber.getProfile();
//        System.out.println(profile);
//        System.out.println(subscriber.getOperator().getName());

//        Subscriber subscriber2 =new Subscriber();
//        subscriber2.setFirstName();
//        subscriber2.getLastName();


//        Subscriber subscriber3 = new Subscriber()
//                .withFirstName("sdffd");


        System.out.println("*********************************************");
        System.out.println(subscriber);
        System.out.println(subscriber.toString());

        System.out.println("*******************");
        Operator operatorLife = new Operator("Life", "Kiev");
        Operator operatorLife2 = new Operator("Life", "Kiev");
        System.out.println(operatorLife2== operatorLife);//сравнение ссылок
        System.out.println(operatorLife2.equals( operatorLife));
    }
}
