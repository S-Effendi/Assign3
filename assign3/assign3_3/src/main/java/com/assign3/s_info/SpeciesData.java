package com.assign3.s_info;

/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */

import java.io.Serializable;

public class SpeciesData implements Serializable{

    private String name;
    private String diet;
    private String type;
    private String req;

    public SpeciesData(){

    }

    public String getName(){
        return name;
    }

    public void setName(String speciesName){
        this.name = speciesName;
    }

    public String getDiet(){
        return diet;
    }

    public void setDiet(String speciesDiet){
        this.diet = speciesDiet;
    }

    public String getType(){
        return type;
    }

    public void setType(String speciesType){
        this.type = speciesType;
    }

    public String getReq(){
        return req;
    }

    public void setReq(String speciesReq){
        this.req = speciesReq;
    }

    public String toString(){
        return "Species Type: "+ type+ "\nName: "+ name+ "\nDiet: "+ diet;
    }

}
