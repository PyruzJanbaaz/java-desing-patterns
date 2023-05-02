package com.pyruz.template;

import com.pyruz.template.pattern.CoffeeBrewer;
import com.pyruz.template.pattern.DripCoffeeBrewer;
import com.pyruz.template.pattern.FrenchPressCoffeeBrewer;

public class TemplateDemo {

    public static void main(String[] args) {
        CoffeeBrewer dripCoffeeBrewer = new DripCoffeeBrewer();
        dripCoffeeBrewer.brewCoffee();

        CoffeeBrewer frenchPressCoffeeBrewer = new FrenchPressCoffeeBrewer();
        frenchPressCoffeeBrewer.brewCoffee();

    }
}
