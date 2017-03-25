package com.assign3.s_identity;
import com.assign3.s_info.SpeciesData;

/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */

public class Species3 implements SpeciesInteface{
    public SpeciesData getSpeciesType(){
        SpeciesData speciesType = new SpeciesData();
        speciesType.setType("Bird");
        speciesType.setName("Parrot");
        speciesType.setDiet("Omnivore");
        speciesType.setReq("Oxygen");

        return speciesType;
    }
}
