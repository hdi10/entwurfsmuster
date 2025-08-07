/**
 * hdi10 2025
 * EntenTests Class
 **/
package com.zelkulon.entwurfsmuster.adapter.ente;

import com.zelkulon.entwurfsmuster.adapter.Ente;
import com.zelkulon.entwurfsmuster.adapter.StockEnte;
import com.zelkulon.entwurfsmuster.adapter.TruthanAdapter;
import com.zelkulon.entwurfsmuster.adapter.WilderTruthan;
import com.zelkulon.entwurfsmuster.adapter.ente.hilfklasse.Hilfsklasser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class EntenTests {



    @Test
    void gutTestEnte1(){
     StockEnte duck = new StockEnte();

     WilderTruthan truthan = new WilderTruthan();
     Ente truthanAdapter = new TruthanAdapter(truthan);

     Logger log = LoggerFactory.getLogger(EntenTests.class);
     log.info("Der Truthan macht ...");

     truthan.kollern();
     truthan.fliegen();

        System.out.println("Die Ente macht ...");
     Hilfsklasser hilfe1 = new Hilfsklasser(duck);

        System.out.println("Der TruthahnAdapter sagt ....");
     Hilfsklasser hilfe2 = new Hilfsklasser(truthanAdapter);




    }

}
