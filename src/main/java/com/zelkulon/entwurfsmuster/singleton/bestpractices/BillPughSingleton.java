/**
 * created on 21.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/singleton/bestpractices
 *
 * BillPughSingleton um zu verhindern das viele Threads mehrere Instanzen der Singleton Klasse erzeugen
 * Mithilfe einer Inneren Statischen Hilfsklasse
 **/
package com.zelkulon.entwurfsmuster.singleton.bestpractices;

public class BillPughSingleton {
    private BillPughSingleton(){};

    // Diese Hilfsklasse beinhaltet die Instanz der Singleton Klasse
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // nur beim Aufruf des Getter wird die Hilfsklasse aufgerufen und Instanziiert die Singleton-Klasse
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

}
