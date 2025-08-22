/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;
//TODO Diese Klasse Testen

import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzas.CheesePizza;
import com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzas.VeggiePizza;

import java.util.Map;
import java.util.function.Supplier;

public class DependantPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("BLN")) {
            if (type.equals("cheese")) {
                pizza = new BLNStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new BLNStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new BLNStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new BLNStylePepperoniPizza();
            }
        } else if (style.equals("Munich")) {
            if (type.equals("cheese")) {
                pizza = new MunichStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new MunichStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new MunichStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new MunichStylePepperoniPizza();
            }

        } else {
            System.out.println("Fehler: Ungültiger Pizza Type");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /// /////////////////////////////////////////////////////////////////////////////////////////////////
    ///    /// /////////////////////////////////////////////////////////////////////////////////////////////////
    ///    /// /////////////////////////////////////////////////////////////////////////////////////////////////

    public Pizza createPizza1(String style, String type) {
        if (style == null || type == null) {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        Pizza pizza = switch (style) {
            case "NY" -> switch (type) {
                case "cheese" -> new BLNStyleCheesePizza();
                case "veggie" -> new BLNStyleVeggiePizza();
                case "clam" -> new BLNStyleClamPizza();
                case "pepperoni" -> new BLNStylePepperoniPizza();
                default -> null;
            };
            case "Chicago" -> switch (type) {
                case "cheese" -> new MunichStyleCheesePizza();
                case "veggie" -> new MunichStyleVeggiePizza();
                case "clam" -> new MunichStyleClamPizza();
                case "pepperoni" -> new MunichStylePepperoniPizza();
                default -> null;
            };
            default -> null;
        };

        if (pizza == null) {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    /// /////////////////////////////////////////////////////////////////////////////////////////////////
    ///    /// /////////////////////////////////////////////////////////////////////////////////////////////////
    ///    /// /////////////////////////////////////////////////////////////////////////////////////////////////

    private static final Map<String, Supplier<Pizza>> PIZZA_FACTORIES = Map.ofEntries(
            Map.entry("bln:cheese", BLNStyleCheesePizza::new),
            Map.entry("bln:veggie", BLNStyleVeggiePizza::new),
            Map.entry("bln:clam", BLNStyleClamPizza::new),
            Map.entry("bln:pepperoni", BLNStylePepperoniPizza::new),

            Map.entry("munich:cheese", MunichStyleCheesePizza::new),
            Map.entry("munich:veggie", MunichStyleVeggiePizza::new),
            Map.entry("munich:clam", MunichStyleClamPizza::new),
            Map.entry("munich:pepperoni", MunichStylePepperoniPizza::new)
    );

    private void process(Pizza p) {
        p.prepare();
        p.bake();
        p.cut();
        p.box();
    }

    public Pizza createPizza2(String style, String type) {
        String key = (style == null || type == null)
                ? "" : (style.toLowerCase() + ":" + type.toLowerCase());

        Pizza pizza = PIZZA_FACTORIES.getOrDefault(key, null) == null
                ? null
                : PIZZA_FACTORIES.get(key).get();

        if (pizza == null) {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        process(pizza);
        return pizza;

    }
}
