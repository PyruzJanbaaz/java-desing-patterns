package com.pyruz.factory;

import com.pyruz.factory.pattern.intrface.Shape;
import com.pyruz.factory.pattern.ShapeFactory;

public class FactoryDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
    }

}