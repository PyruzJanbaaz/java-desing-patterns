package com.pyruz.factory.impl;

import com.pyruz.factory.intrface.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}
