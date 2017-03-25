package com.assign3;
import com.assign3.s_identity.Species1;
import com.assign3.s_identity.Species2;
import com.assign3.s_identity.SpeciesInteface;
import junit.framework.TestCase;


/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */
public class SpeciesTest extends TestCase {
    private SpeciesInteface s_identity;

    public void testSpecies1() throws Exception {
        s_identity = new Species1();
        System.out.println("Type of species: " + s_identity.getSpeciesType().getType());

        assertEquals(s_identity.getSpeciesType().getReq(), "Oxygen");
    }

    public void testSpecies2() throws Exception {
         s_identity = new Species2();
        System.out.println("Type of species: " + s_identity.getSpeciesType().getType());

        assertEquals(s_identity.getSpeciesType().getReq(), "Oxygen");
    }

    public void testSpecies3() throws Exception {
        s_identity = new Species2();
        System.out.println("Type of species: " + s_identity.getSpeciesType().getType());

        System.out.println(s_identity.toString());
        assertEquals(s_identity.getSpeciesType().getReq(), "Oxygen");

    }
}
