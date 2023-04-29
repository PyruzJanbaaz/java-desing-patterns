package com.pyruz.factory;

import com.pyruz.factory.intrface.Shape;

public class FactoryDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
    }

}