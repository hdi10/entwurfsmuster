/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class MunichStylePepperoniPizza extends Pizza {
    public MunichStylePepperoniPizza() {
        name = "Munich Style Pepperoni Pizza";
        dough = "Thick Pretzel Dough";
        sauce = "Tomato Sauce";

        toppings.add("Emmental Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Onions");
        toppings.add("Mushrooms");
    }
}
