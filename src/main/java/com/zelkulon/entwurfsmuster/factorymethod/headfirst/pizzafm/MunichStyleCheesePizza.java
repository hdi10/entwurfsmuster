/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class MunichStyleCheesePizza extends Pizza {
    public MunichStyleCheesePizza() {
        name = "Munich Style Cheese Pizza";
        dough = "Thick Pretzel Dough";
        sauce = "Beer Cheese Sauce";

        toppings.add("Emmental Cheese");
        toppings.add("Bavarian Obazda");
    }
}
