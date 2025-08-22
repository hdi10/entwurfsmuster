/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class BLNStyleVeggiePizza extends Pizza {
    public BLNStyleVeggiePizza() {
        name = "Berlin Style Veggie Pizza";
        dough = "Rustic Rye Crust";
        sauce = "Tomato-Basil Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Spinach");
        toppings.add("Mushrooms");
        toppings.add("Onions");
        toppings.add("Peppers");
    }
}
