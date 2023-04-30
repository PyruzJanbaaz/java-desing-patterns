package com.pyruz.decorator.pattern;

import com.pyruz.decorator.pattern.intrface.Pizza;

public class PepperoniTopping extends ToppingDecorator {
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + .65;
    }
}
