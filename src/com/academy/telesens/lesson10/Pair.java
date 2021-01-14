package com.academy.telesens.lesson10;

import java.lang.reflect.Field;

public class Pair {
//    Pair first;
//    Pair second;
//
//    public void setFirst(Pair first) {
//        this.first = first;
//    }
//
//    public void setSecond(Pair second) {
//        this.second = second;
//    }
//
//    public Pair getFirst() {
//        return first;
//    }
//
//    public Pair getSecond() {
//        return second;
//    }
//
//    public Pair(Pair first, Pair second) {
//        this.first = first;
//        this.second = second;
//    }
    private Object first;
    private Object second;

    public Object getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
}
