/**
 * created on 21.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/singleton/bestpractices
 **/
package com.zelkulon.entwurfsmuster.singleton.bestpractices;

import java.io.Serializable;

public class SerializedSingeltonReadResolve implements Serializable {

    private static final long serialVersionUID = -7604766932017737227L;

    private SerializedSingeltonReadResolve() {}

    private static class SingletonHelper{
        private static final SerializedSingeltonReadResolve instance = new SerializedSingeltonReadResolve();
    }

    public static SerializedSingeltonReadResolve getInstance() {
        return SerializedSingeltonReadResolve.SingletonHelper.instance;
    }

    // dies readResolve()-Methode verhinderzt die Zerstörung des Singleton-Pattern
    protected Object readResolve() {
        return getInstance();
    }
}
