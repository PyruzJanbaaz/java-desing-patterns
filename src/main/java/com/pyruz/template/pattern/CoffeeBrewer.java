package com.pyruz.template.pattern;

public abstract class CoffeeBrewer {

    // Template method that defines the steps to brew a coffee
    public final void brewCoffee() {
        boilWater();
        brewCoffeeGrinds();
        pourCoffee();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public abstract void brewCoffeeGrinds();

    public void pourCoffee() {
        System.out.println("Pouring coffee...");
    }

    public abstract void addCondiments();
}
