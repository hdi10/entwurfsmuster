/**
 * The Class LazyInitializedSingleton was created on 21.08.25 by hdi10 on IntelliJ IDEA
 * for the Project entwurfsmuster in the package com.zelkulon.entwurfsmuster.singleton.bestpractices
 * the path to this file is: src/main/java/com/zelkulon/entwurfsmuster/singleton/bestpractices
 *
 * Instanziierung im Public Getter
 **/
package com.zelkulon.entwurfsmuster.singleton.bestpractices;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
