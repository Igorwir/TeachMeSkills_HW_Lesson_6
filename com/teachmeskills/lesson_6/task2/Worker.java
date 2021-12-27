package com.teachmeskills.lesson_6.task2;

public class Worker implements Info {
    String posicion = "worker";

    @Override
    public void showInfo() {
        System.out.println("Pocicion is : " + posicion);
    }
}
