package com.pyruz.decorator.pattern;

import com.pyruz.decorator.pattern.intrface.Pizza;

public class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with mushrooms";
    }

    @Override
    public double getCost() {
        return super.getCost() + .99;
    }
}
