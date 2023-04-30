package com.pyruz.decorator;

import com.pyruz.decorator.pattern.MushroomTopping;
import com.pyruz.decorator.pattern.PepperoniTopping;
import com.pyruz.decorator.pattern.impl.CheesePizza;
import com.pyruz.decorator.pattern.intrface.Pizza;

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new CheesePizza();
        pizza = new MushroomTopping(pizza);
        pizza = new PepperoniTopping(pizza);

        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Cost: " + pizza.getCost());
    }
}
