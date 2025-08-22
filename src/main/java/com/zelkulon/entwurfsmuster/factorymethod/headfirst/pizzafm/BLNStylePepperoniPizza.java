/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class BLNStylePepperoniPizza extends Pizza {
    public BLNStylePepperoniPizza() {
        name = "Berlin Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Spicy Tomato Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Red Onion");
        toppings.add("Bell Peppers");
        toppings.add("Chili Flakes");
    }
}
