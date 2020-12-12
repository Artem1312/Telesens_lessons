package com.academy.telesens.lesson_06.Component;

public abstract class Component {
    protected int xPosition;
    protected int yPosition;
    protected int width;
    protected int height;
    protected String text;

    //public abstract void drow(){
     //   String.format("%d %d %d %d %s", xPosition,yPosition,width,height,text);
    //}

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Component{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                '}';
    }
}
