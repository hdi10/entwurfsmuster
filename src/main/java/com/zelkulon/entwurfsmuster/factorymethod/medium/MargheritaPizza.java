/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/medium
 *
 * Konkretes Produkt
 **/
package com.zelkulon.entwurfsmuster.factorymethod.medium;

public class MargheritaPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("MargheritaPizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("MargheritaPizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("MargheritaPizza.cut");
    }

    @Override
    public void box() {
        System.out.println("MargheritaPizza.box");
    }
}
