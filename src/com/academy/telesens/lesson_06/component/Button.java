package com.academy.telesens.lesson_06.component;

public class Button extends Component{
    public void draw(){
        System.out.println(super.getText());
        System.out.println(super.getHeight());
        System.out.println(super.getWidth());
        System.out.println(super.getxPosition());
        System.out.println(super.getyPosition());
    }

    public void click(){

    }
}
