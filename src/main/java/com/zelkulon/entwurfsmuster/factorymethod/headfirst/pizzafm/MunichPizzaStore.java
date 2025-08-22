/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

public class MunichPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new MunichStyleCheesePizza();
        }else if(item.equals("veggie")) {
            return new MunichStyleVeggiePizza();
        }else if(item.equals("clam")) {
            return new MunichStyleClamPizza();
        }else if(item.equals("pepperoni")) {
            return new MunichStylePepperoniPizza();
        } else return null;
    }

    Pizza createPizzaSwitched(String item) {
        return switch(item) {
            case "cheese" -> new MunichStyleCheesePizza();
            case "veggie" -> new MunichStyleVeggiePizza();
            case "clam" -> new MunichStyleClamPizza();
            case "pepperoni" -> new MunichStylePepperoniPizza();
            default -> null;
        };
    }
}
