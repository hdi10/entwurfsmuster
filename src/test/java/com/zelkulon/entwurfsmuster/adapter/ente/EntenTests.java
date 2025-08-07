/**
 * hdi10 2025
 * EntenTests Class
 **/
package com.zelkulon.entwurfsmuster.adapter.ente;

import com.zelkulon.entwurfsmuster.adapter.Ente;
import com.zelkulon.entwurfsmuster.adapter.Stockente;
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
     Stockente duck = new Stockente();

     WilderTruthan truthan = new WilderTruthan();
     Ente truthanAdapter = new TruthanAdapter(truthan);

     Logger logger = LoggerFactory.getLogger(EntenTests.class);
     log.info("Der Truthan macht ...");

     truthan.kollern();
     truthan.fliegen();

     log.info("Die Ente macht ...");




    }

}
