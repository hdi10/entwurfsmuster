/**
 * created on 21.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/test/java/com/zelkulon/entwurfsmuster/singleton/bestpractices
 **/
package com.zelkulon.entwurfsmuster.singleton.bestpractices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;


public class ReflectionSingletonTests {

    @Test
    public void test() {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                // Dieser Teil zerstört das Singleton Pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        }catch(Exception e){
            e.getStackTrace();
            e.printStackTrace();
        }

        Assertions.assertNotNull(instanceOne);
        Assertions.assertNotNull(instanceTwo);
        Assertions.assertNotEquals(instanceOne.hashCode(), instanceTwo.hashCode());

    }

}
