package com.pyruz.decorator.pattern;

import com.pyruz.decorator.pattern.intrface.Pizza;

public abstract class ToppingDecorator implements Pizza {
    Pizza pizza;

    protected ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription();
    }

    public double getCost(){
        return pizza.getCost();
    }
}
