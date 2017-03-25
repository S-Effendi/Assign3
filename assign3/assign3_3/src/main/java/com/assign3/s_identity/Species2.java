package com.assign3.s_identity;
import com.assign3.s_info.SpeciesData;

/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */

public class Species2 implements SpeciesInteface{
    public SpeciesData getSpeciesType(){
        SpeciesData speciesType = new SpeciesData();
        speciesType.setType("Reptile");
        speciesType.setName("Crocodile");
        speciesType.setDiet("Carnivore");
        speciesType.setReq("Oxygen");

        return speciesType;
    }
}
