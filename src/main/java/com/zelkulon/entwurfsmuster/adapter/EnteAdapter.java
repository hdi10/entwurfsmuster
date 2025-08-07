/**
 * hdi10 2025
 * EnteAdapter Class realisiert die Ente in quaken und fliegen
 **/
package com.zelkulon.entwurfsmuster.adapter;

import java.util.Random;

public class EnteAdapter implements Truthan {
    Ente ente;
    Random zufall;

    public EnteAdapter(Ente ente) {
        this.ente = ente;
        zufall = new Random();
    }

    @Override
    public void kollern() {
        ente.quaken();
    }

    @Override
    public void fliegen() {
        if(zufall.nextInt(5) == 0) {
            ente.fliegen();
        }
    }
}
