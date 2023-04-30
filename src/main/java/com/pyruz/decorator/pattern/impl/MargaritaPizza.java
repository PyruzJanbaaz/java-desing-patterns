package com.pyruz.decorator.pattern.impl;

import com.pyruz.decorator.pattern.intrface.Pizza;

public class MargaritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Margarita Pizza";
    }

    @Override
    public double getCost() {
        return 3.3;
    }
}
