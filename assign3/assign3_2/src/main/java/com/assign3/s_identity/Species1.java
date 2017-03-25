package com.assign3.s_identity;
import com.assign3.s_info.SpeciesData;
/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */

public class Species1 implements SpeciesInteface{
    public SpeciesData getSpeciesType(){
        SpeciesData speciesType = new SpeciesData();
        speciesType.setType("Mammal");
        speciesType.setName("Elephant");
        speciesType.setDiet("Herbivore");
        speciesType.setReq("Oxygen");

        return speciesType;
    }
}
