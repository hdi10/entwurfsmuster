/**
 * Dastekin created on 07.08.2025 the TruthanTests-Class inside the package - com.zelkulon.entwurfsmuster.adapter.ente
 */
package com.zelkulon.entwurfsmuster.adapter.ente;

import com.zelkulon.entwurfsmuster.adapter.EnteAdapter;
import com.zelkulon.entwurfsmuster.adapter.StockEnte;
import com.zelkulon.entwurfsmuster.adapter.Truthan;
import org.junit.jupiter.api.Test;

public class TruthanTests {

    @Test
    void gutTestTruthan1(){
        StockEnte ente = new StockEnte();
        Truthan entenAdapter = new EnteAdapter(ente);

        for (int i = 0; i < 10; i++) {
            System.out.println("Der Enten-Adapter sagt ---");
            entenAdapter.kollern();
            entenAdapter.fliegen();
        }
    }

}
