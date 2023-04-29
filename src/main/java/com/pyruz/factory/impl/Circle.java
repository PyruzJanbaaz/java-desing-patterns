package com.pyruz.factory.impl;

import com.pyruz.factory.intrface.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}
