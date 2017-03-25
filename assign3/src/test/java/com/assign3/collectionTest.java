package com.assign3;

import junit.framework.TestCase;

/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */
public class collectionTest extends TestCase {

    public void testlistIt() throws Exception {
        {
            listIt list = new listIt();
            //String answer = list.getFruits(3);

            assertEquals("Not a fruit", "Kiwi", list.getFruits(0));
        }

    }

    public void testmapIt() throws Exception {
        {
            mapIt map = new mapIt();

            assertTrue("No scarf in stock: ", map.findScarf());
        }
    }

    public void testsetIt() throws Exception {

        setIt set = new setIt();

        assertTrue("Card value untrue of klawers set",set.getCard());
    }
}
