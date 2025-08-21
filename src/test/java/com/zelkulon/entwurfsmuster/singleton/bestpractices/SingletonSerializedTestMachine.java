/**
 * created on 21.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/test/java/com/zelkulon/entwurfsmuster/singleton/bestpractices
 **/
package com.zelkulon.entwurfsmuster.singleton.bestpractices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class SingletonSerializedTestMachine {

    @Test
    public void testSingletonDestroySingletonPattern() throws FileNotFoundException, IOException, ClassNotFoundException {

        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        // schreibe Object in Datei (serialize)
        ObjectOutput os = new ObjectOutputStream(new FileOutputStream("file.ser"));
        os.writeObject(instanceOne);
        os.close();

        // lies Object aus Datei aus (deserialize)
        ObjectInput is = new ObjectInputStream(new FileInputStream("file.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) is.readObject();
        is.close();



        Assertions.assertNotNull(instanceOne);
        Assertions.assertNotNull(instanceTwo);
        Assertions.assertNotEquals(instanceOne.hashCode(), instanceTwo.hashCode());


    }

    @Test
    public void testSingletonDontDestroySingletonPattern() throws FileNotFoundException, IOException, ClassNotFoundException {

        SerializedSingeltonReadResolve instanceOne = SerializedSingeltonReadResolve.getInstance();
        // schreibe Object in Datei (serialize)
        ObjectOutput os = new ObjectOutputStream(new FileOutputStream("file.ser"));
        os.writeObject(instanceOne);
        os.close();

        // lies Object aus Datei aus (deserialize)
        ObjectInput is = new ObjectInputStream(new FileInputStream("file.ser"));
        SerializedSingeltonReadResolve instanceTwo = (SerializedSingeltonReadResolve) is.readObject();
        is.close();



        Assertions.assertNotNull(instanceOne);
        Assertions.assertNotNull(instanceTwo);
        Assertions.assertEquals(instanceOne.hashCode(), instanceTwo.hashCode());


    }

}
