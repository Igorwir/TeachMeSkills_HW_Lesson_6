package com.teachmeskills.lesson_6.task2;

public class Director implements Info {
    String posicion = "director";

    @Override
    public void showInfo() {
        System.out.println("Pocicion is : " + posicion);
    }
}
