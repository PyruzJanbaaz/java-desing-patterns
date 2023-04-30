package com.pyruz.decorator.pattern.impl;

import com.pyruz.decorator.pattern.intrface.Pizza;

public class CheesePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Cheese Pizza";
    }

    @Override
    public double getCost() {
        return 2.3;
    }
}
