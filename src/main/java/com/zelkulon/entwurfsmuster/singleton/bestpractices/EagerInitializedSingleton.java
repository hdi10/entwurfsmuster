/**
 * ich nutze hier den Lombok Getter der Übersichtlichkeit halber
 *
 * Instanziierung der Singleton Klasse zur Runtime
 * Quellen:
 * https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples#1-eager-initialization
 */

package com.zelkulon.entwurfsmuster.singleton.bestpractices;

import lombok.Getter;

public class EagerInitializedSingleton {
    @Getter
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // privater Konstruktor um Client Anwendungen zu hindern diesen Konstruktor zu nutzen
    private EagerInitializedSingleton() {}

}
