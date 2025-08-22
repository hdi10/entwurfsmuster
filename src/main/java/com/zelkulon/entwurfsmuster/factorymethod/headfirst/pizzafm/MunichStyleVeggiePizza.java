/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class MunichStyleVeggiePizza extends Pizza {
    public MunichStyleVeggiePizza() {
        name = "Munich Style Veggie Pizza";
        dough = "Pretzel Dough";
        sauce = "Tomato Sauce";

        toppings.add("Fresh Mushrooms");
        toppings.add("Onions");
        toppings.add("Spinach");
        toppings.add("Bell Peppers");
        toppings.add("Cheese Mix");
    }
}
