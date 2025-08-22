/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class BLNStyleClamPizza extends Pizza {
    public BLNStyleClamPizza() {
        name = "Berlin Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Garlic Cream Sauce";

        toppings.add("Fresh Clams");
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Parsley");
    }
}
