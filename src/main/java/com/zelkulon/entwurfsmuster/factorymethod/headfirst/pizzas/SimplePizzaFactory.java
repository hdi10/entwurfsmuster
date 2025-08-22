/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzas
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzas;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }




}
