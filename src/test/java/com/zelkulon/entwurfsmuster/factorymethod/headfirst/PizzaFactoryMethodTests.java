/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/test/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst;

import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm.BerlinPizzaStore;
import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm.MunichPizzaStore;
import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm.Pizza;
import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm.PizzaStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class PizzaFactoryMethodTests {

    private PizzaStore blnStore;
    private PizzaStore munichStore;

    @BeforeEach
    public void setup() {
        // Arrange
        blnStore = new BerlinPizzaStore();
        munichStore = new MunichPizzaStore();
    }

    // Nicht gut, System.out Tests
    @Test
    public void testPizzaAbstractFactoryMethod() {
        Pizza pizza = blnStore.orderPizza("cheese");
        System.out.println("Stefan ordered a " + pizza.getName() + "\n");

        pizza = munichStore.orderPizza("cheese");
        System.out.println("Rainer ordered a " + pizza.getName() + "\n");

        pizza = blnStore.orderPizza("clam");
        System.out.println("Stefan ordered a " + pizza.getName() + "\n");

        pizza = munichStore.orderPizza("clam");
        System.out.println("Rainer ordered a " + pizza.getName() + "\n");

        pizza = munichStore.orderPizza("pepperoni");
        System.out.println("Stefan ordered a " + pizza.getName() + "\n");

        pizza = munichStore.orderPizza("pepperoni");
        System.out.println("Rainer ordered a " + pizza.getName() + "\n");

        pizza = munichStore.orderPizza("veggie");
        System.out.println("Stefan ordered a " + pizza.getName() + "\n");

        pizza = munichStore.orderPizza("veggie");
        System.out.println("Rainer ordered a " + pizza.getName() + "\n");


    }

    // Berliner Store verkauft Cheese Pizza mit Cheese und Berlin im Namen
    @Test
    void cheese_from_each_city_has_city_and_type_in_name() {
        Pizza bln = blnStore.orderPizza("cheese");
        Pizza muc = munichStore.orderPizza("cheese");

        Assertions.assertAll(
                () -> Assertions.assertNotNull(bln),
                () -> Assertions.assertTrue(bln.getName().toLowerCase().contains("berlin")),
                () -> Assertions.assertTrue(bln.getName().toLowerCase().contains("cheese")),
                () -> Assertions.assertNotNull(muc),
                () -> Assertions.assertTrue(muc.getName().toLowerCase().contains("munich")),
                () -> Assertions.assertTrue(muc.getName().toLowerCase().contains("cheese"))
        );
    }

    //Anderer Tests Berliner Store verkauft Cheese Pizza mit Cheese und Berlin im Namen
    @Test
    void orders_should_return_expected_names() {
        Pizza p1 = blnStore.orderPizza("cheese");
        Assertions.assertNotNull(p1);
        Assertions.assertTrue(p1.getName().toLowerCase().contains("berlin"));
        Assertions.assertTrue(p1.getName().toLowerCase().contains("cheese"));

        Pizza p2 = munichStore.orderPizza("clam");
        Assertions.assertNotNull(p2);
        Assertions.assertTrue(p2.getName().toLowerCase().contains("munich"));
        Assertions.assertTrue(p2.getName().toLowerCase().contains("clam"));
    }


    // Exception handling einbauen, bisher -> NullPointerException
    @Test
    void unknown_type_should_return_null_or_throw() {
        assertThrows(NullPointerException.class, () -> blnStore.orderPizza("hawaii"));
    }

    // Parametriesierte Tests
    @ParameterizedTest
    @CsvSource({
            "Berlin,  cheese,   berlin,  cheese",
            "Berlin,  clam,     berlin,  clam",
            "Munich,  cheese,   munich,  cheese",
            "Munich,  pepperoni,munich,  pepperoni",
            "Munich,  veggie,   munich,  veggie"
    })
    void store_and_type_should_match_in_name(String city, String type, String expectedCity, String expectedType) {
        PizzaStore store = city.equals("Berlin") ? blnStore : munichStore;
        Pizza pizza = store.orderPizza(type);

        Assertions.assertNotNull(pizza);
        String name = pizza.getName().toLowerCase();
        Assertions.assertTrue(name.contains(expectedCity));
        Assertions.assertTrue(name.contains(expectedType));
    }

}
