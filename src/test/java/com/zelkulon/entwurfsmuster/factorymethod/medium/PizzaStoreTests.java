/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/test/java/com/zelkulon/entwurfsmuster/factorymethod/medium
 **/
package com.zelkulon.entwurfsmuster.factorymethod.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaStoreTests {

    @Test
    public void testPizzaStoreMargheritaGutTest0() {

        PizzaFactory pizzaFactory = new MargheritaPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        Assertions.assertNotNull(pizza);
        Assertions.assertInstanceOf(Pizza.class, pizza);
        Assertions.assertInstanceOf(MargheritaPizza.class, pizza);

    }

    @Test
    public void testPizzaStorePepperoniGutTest1() {

        PizzaFactory pizzaFactory = new PepperoniPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        Assertions.assertNotNull(pizza);
        Assertions.assertInstanceOf(Pizza.class, pizza);
        Assertions.assertInstanceOf(PepperoniPizza.class, pizza);

    }

}
