package com.teachmeskills.lesson_6.task1;

import com.teachmeskills.lesson_6.task1.Figures;

public  class Rectangle extends Figures {
    public static final String NAME = "Rectangle";
    double wit;
    double leng;

    Rectangle(double wit,double leng){
       this.wit = wit;
       this.leng = leng;
    }

    @Override
    public double getArea() {
      return  wit * leng;

    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPerimeter() {
       double p = 2*(wit+leng);
        return p;
    }
}
