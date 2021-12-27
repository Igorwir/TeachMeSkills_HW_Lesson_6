package com.teachmeskills.lesson_6.task1;

import com.teachmeskills.lesson_6.task1.Figures;

public class Triangle extends Figures {
    public static final String NAME = "Triangle";
    double sideA;
    double sideB;
    double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        double p = sideA + sideB + sideC / 2;
        double pl = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return pl;

    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPerimeter() {
        double p = sideA + sideB + sideC;
        return p;
    }
}