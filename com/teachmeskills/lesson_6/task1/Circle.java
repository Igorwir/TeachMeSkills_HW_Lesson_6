package com.teachmeskills.lesson_6.task1;

public class Circle extends Figures {
    public static final String NAME = "Circle";

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
}