/**
 * created on 22.08.25
 * by hdi10 with IntelliJ IDEA
 * for entwurfsmuster
 * path to this file is: src/main/java/com/zelkulon/entwurfsmuster/factorymethod/medium
 * https://medium.com/@eshikashah2001/exploring-the-factory-method-design-pattern-4d270b6ff935
 * Product Interface
 **/
package com.zelkulon.entwurfsmuster.factorymethod.medium;

public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}
