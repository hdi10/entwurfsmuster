/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class BerlinPizzaStore extends PizzaStore {

    /*Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new BLNStyleCheesePizza();
        }else if(item.equals("veggie")) {
            return new BLNStyleVeggiePizza();
        }else if(item.equals("clam")) {
            return new BLNStyleClamPizza();
        }else if(item.equals("pepperoni")) {
            return new BLNStylePepperoniPizza();
        } else return null;
    }*/

    Pizza createPizza(String item) {
        return switch(item) {
            case "cheese" -> new BLNStyleCheesePizza();
            case "veggie" -> new BLNStyleVeggiePizza();
            case "clam" -> new BLNStyleClamPizza();
            case "pepperoni" -> new BLNStylePepperoniPizza();
            default -> null;
        };
    }
}
