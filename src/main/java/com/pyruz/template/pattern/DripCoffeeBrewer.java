package com.pyruz.template.pattern;

public class DripCoffeeBrewer extends CoffeeBrewer{
    @Override
    public void brewCoffeeGrinds() {
        System.out.println("Brewing drip coffee grinds...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and cream...");
    }
}
