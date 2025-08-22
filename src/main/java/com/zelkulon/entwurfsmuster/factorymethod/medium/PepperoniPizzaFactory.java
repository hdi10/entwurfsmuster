/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/medium
 * Konkrete Creator Implementierung
 **/
package com.zelkulon.entwurfsmuster.factorymethod.medium;

public class PepperoniPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
