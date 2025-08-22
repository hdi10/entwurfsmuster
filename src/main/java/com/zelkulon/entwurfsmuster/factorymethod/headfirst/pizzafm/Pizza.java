/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzafm
 * https://github.com/bethrobson/Head-First-Design-Patterns/blob/master/src/headfirst/designpatterns/factory/pizzafm/Pizza.java
 * */
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzafm;

import lombok.Getter;

import java.util.ArrayList;

public abstract class Pizza {
    @Getter
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("---- " + name+ "----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
