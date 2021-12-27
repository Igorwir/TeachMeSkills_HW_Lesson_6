package com.teachmeskills.lesson_6.task1;

public class Test {
    public static void main(String[] args) {
        Figures[] figur = {new Triangle(4, 6, 4), new Rectangle(5, 8), new Circle(8)};

        for (Figures fig : figur) {
            System.out.println("Area " + fig.getName() + " " + fig.getArea() );
            System.out.println("Perimetr " + fig.getName() +" " + fig.getPerimeter());
        }
    }
}