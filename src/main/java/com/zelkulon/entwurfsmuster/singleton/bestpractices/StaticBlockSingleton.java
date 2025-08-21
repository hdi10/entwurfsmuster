/**
 * The Class StaticBlockSingleton was created on 21.08.25 by hdi10 on IntelliJ IDEA
 * for the Project entwurfsmuster in the package com.zelkulon.entwurfsmuster.singleton.bestpractices
 * the path to this file is: src/main/java/com/zelkulon/entwurfsmuster/singleton/bestpractices
 *
 *  ich nutze hier den Lombok Getter um Übersichtlich zu bleiben
 *  Instanziierung in einem static block um Exception Handling zu gewähren
 */
package com.zelkulon.entwurfsmuster.singleton.bestpractices;

import lombok.Getter;

public class StaticBlockSingleton {

    @Getter
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static {
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

}
