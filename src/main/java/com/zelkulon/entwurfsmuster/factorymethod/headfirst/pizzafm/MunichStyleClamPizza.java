/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class MunichStyleClamPizza extends Pizza {
    public MunichStyleClamPizza() {
        name = "Munich Style Clam Pizza";
        dough = "Thick Pretzel Dough";
        sauce = "Cream Sauce";

        toppings.add("Fresh Clams");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Parsley");
    }
}
