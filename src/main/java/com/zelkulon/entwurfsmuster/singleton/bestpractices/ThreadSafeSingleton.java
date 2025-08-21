/**
 * created on 21.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/singleton/bestpractices
 * <p>
 * Threadsicher:
 * Synchrone Instanziierung im Public Getter
 * PS: Nur ein Thread führt zeitgleich diese Methode aus
 * weiterführende Informationen auf:
 * https://www.digitalocean.com/community/tutorials/thread-safety-in-java-singleton-classes
 **/
package com.zelkulon.entwurfsmuster.singleton.bestpractices;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    // Weniger effiziente Variante: Synchronisierung führt zu Instanzvariationen
    //  das führt zu einem Overhead
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    // Performantere Variante nutzt Locking
    // Synchronized Block stellt sicher, dass nur eine Instanz der Singleton Klasse erzeugt wird
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }


}
