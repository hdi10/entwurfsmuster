/**
 * hdi10 2025
 * EntenTests Class
 **/
package com.zelkulon.entwurfsmuster.adapter.ente;

import com.zelkulon.entwurfsmuster.adapter.Ente;
import com.zelkulon.entwurfsmuster.adapter.StockEnte;
import com.zelkulon.entwurfsmuster.adapter.TruthanAdapter;
import com.zelkulon.entwurfsmuster.adapter.WilderTruthan;
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

     Logger logger = LoggerFactory.getLogger(EntenTests.class);
     log.info("Der Truthan macht ...");

     truthan.kollern();
     truthan.fliegen();

     log.info("Die Ente macht ...");
     Hilfsklasser hilfe1 = new Hilfsklasser(duck);

     log.info("Der TruthahnAdapter sagt ....");
     Hilfsklasser hilfe2 = new Hilfsklasser(truthanAdapter);




    }

}
