/**
 * Dastekin created on 07.08.2025 the Hilfsklasser-Class inside the package - com.zelkulon.entwurfsmuster.adapter.ente
 */
package com.zelkulon.entwurfsmuster.adapter.ente.hilfklasse;

import com.zelkulon.entwurfsmuster.adapter.Ente;

public class Hilfsklasser {
    Ente ente;

    public Hilfsklasser(Ente ente) {
        this.ente =  ente;
    }

    public static void testEnte(Ente ente){
        ente.quaken();
        ente.fliegen();
    }
}
