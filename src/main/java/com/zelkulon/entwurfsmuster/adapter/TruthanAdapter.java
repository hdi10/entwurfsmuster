/**
 * hdi10 2025
 * TruthanAdapter Class
 **/
package com.zelkulon.entwurfsmuster.adapter;

public class TruthanAdapter implements Ente {
    Truthan truthan;

    public TruthanAdapter(Truthan truthan) {
    this.truthan = truthan;
    }


    @Override
    public void quaken() {
        truthan.kollern();
    }

    @Override
    public void fliegen() {
        for (int i = 0; i < 5; i++) {

            truthan.fliegen();
        }
    }
}
