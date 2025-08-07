/**
 * hdi10 2025
 * Stockente Class
 **/
package com.zelkulon.entwurfsmuster.adapter;

public class StockEnte implements Ente{

    @Override
    public void quaken() {
        System.out.println("Quack");
    }

    @Override
    public void fliegen() {
        System.out.println("Ich fliege!");
    }
}
