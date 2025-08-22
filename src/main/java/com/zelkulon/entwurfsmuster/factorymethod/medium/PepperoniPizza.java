/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/medium
 * Konkrete Product Implementierung
 **/
package com.zelkulon.entwurfsmuster.factorymethod.medium;

public class PepperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Pepperoni pizza preparation");
    }

    @Override
    public void bake() {
        System.out.println("Pepperoni pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Pepperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Pepperoni pizza box");
    }
}
