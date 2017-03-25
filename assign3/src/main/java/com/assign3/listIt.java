package com.assign3;

/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */
import java.util.*;

public class listIt {

    private ArrayList<String> fruitList = new ArrayList<String>();
    private String fruitTypes[] = {"Kiwi", "Strawberry","Gooseberry"};

    public listIt(){
        for(int i = 0; i < 3; i++) {
            fruitList.add(i, fruitTypes[i]);
        }
        System.out.println("Favourite fruits: " + fruitList);
    }

    public String getFruits(int i)
    {

        System.out.println("Actual: " + fruitList.get(i));
        String fruit = fruitList.get(i);
        return fruit;
    }
}