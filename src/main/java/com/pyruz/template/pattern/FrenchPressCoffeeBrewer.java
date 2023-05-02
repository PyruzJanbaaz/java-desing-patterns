package com.pyruz.template.pattern;

public class FrenchPressCoffeeBrewer extends CoffeeBrewer{
    @Override
    public void brewCoffeeGrinds() {
        System.out.println("Brewing French press coffee grinds...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding cinnamon and honey...");
    }
}
