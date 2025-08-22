/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class BLNStyleCheesePizza extends Pizza {
    public BLNStyleCheesePizza() {
        name = "Berlin Style Cheese Pizza";
        dough = "Rustic Rye Crust";
        sauce = "Spicy Tomato Sauce";

        toppings.add("Berliner Gouda");
        toppings.add("Extra Mozzarella");
    }
}
