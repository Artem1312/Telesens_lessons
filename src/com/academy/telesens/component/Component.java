package com.academy.telesens.component;

import com.academy.telesens.lesson_08.VisualComponent;

abstract class Component implements VisualComponent {
    protected int xPosition = 0;
    protected int yPosition = 0;
    protected int width = 0;
    protected int height = 0;
    protected String text = "Default_Name";

    public Component(String text) {
        this.text = text;
    }

    protected Component() {
    }

    abstract public void draw();

//    public void draw(){
//        System.out.println("Component");
//    }

    abstract public void setxPosition();
    abstract public void setyPosition();
    abstract public void setWidth();
    abstract public void setHeight();
    abstract public void setText();

    abstract public void getxPosition();
    abstract public void getyPosition();
    abstract public void getwidth();
    abstract public void getheight();
    abstract public void gettext();
}
