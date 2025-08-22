/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/headfirst/pizzas
 **/
package com.zelkulon.entwurfsmuster.factorymethod.headfirst.pizzas;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    @Getter
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for(String topping : toppings){
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
