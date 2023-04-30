package com.pyruz.factory.pattern.impl;

import com.pyruz.factory.pattern.intrface.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}
