/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/test/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst;

import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzas.Pizza;
import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzas.PizzaStore;
import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzas.SimplePizzaFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzasTests {

    private PizzaStore store;

    @BeforeEach
    public void setup() {
        // Arrange
        SimplePizzaFactory factory = new SimplePizzaFactory();
        store =  new PizzaStore(factory);
    }

    @Test
    public void testPizzasGutTestCheesePizza() {
        // Act
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        // Assert
        Assertions.assertNotNull(pizza, "Pizza sollte nicht null sein");
        Assertions.assertEquals("Cheese Pizza",pizza.getName());
    }

    @Test
    public void testPizzasGutTestVeggiePizzaSauce() {
        // Act
        Pizza pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        // Assert
        Assertions.assertNotNull(pizza, "Pizza sollte nicht null sein");

        Assertions.assertEquals("Veggie Pizza",pizza.getName());
    }
}
