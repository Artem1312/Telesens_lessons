package com.academy.telesens.lesson_06.Component;

public class Button extends Component{
    Button components = new Button();

    @Override
    public void drow() {
        System.out.println("Drow button");

    }

    public void click(){
        System.out.println("Button:click");
    }
}
