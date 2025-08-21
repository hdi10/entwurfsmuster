/**
 * created on 21.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/singleton/bestpractices
 *
 * Singleton mit Serializable Interface Implementierung
 *  zur Persistierung der Zustände im Dateisystem, um diese später wieder aufzurufen
 **/
package com.zelkulon.entwurfsmuster.singleton.bestpractices;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737116L;

    private SerializedSingleton() {}

    private static class SingeltonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingeltonHelper.instance;
    }

}
