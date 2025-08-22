/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzas
 * https://github.com/bethrobson/Head-First-Design-Patterns/blob/master/src/headfirst/designpatterns/factory/pizzas/CheesePizza.java
 * */
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzas;

public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozarella");
        toppings.add("Parmesan");
    }

}
