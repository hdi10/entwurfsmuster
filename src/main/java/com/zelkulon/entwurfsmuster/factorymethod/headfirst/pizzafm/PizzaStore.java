/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " +  pizza.getName() +" ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
