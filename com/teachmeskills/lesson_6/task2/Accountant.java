package com.teachmeskills.lesson_6.task2;

public class Accountant implements Info {
    String posicion = "accountat";

    @Override
    public void showInfo() {
        System.out.println("Pocicion is : " + posicion);
    }
}
