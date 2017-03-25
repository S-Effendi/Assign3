package com.assign3;

/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class setIt {

    private Set <Integer> cardNum = new HashSet<Integer>();
    private int cardAmnt[] = {3, 20, 2, 0, 11, 14, 1};

    public setIt(){
        for(Integer i : cardAmnt) {
            cardNum.add(i);
        }
        System.out.println("Set: " + cardNum);

        TreeSet <Integer> sortedSet = new TreeSet<Integer>(cardNum);

        System.out.println("Representation of scores lowest to highest: " + sortedSet);
    }

    public boolean getCard(){
        System.out.println("Card: Manell, Allocated points: 14, Found: " + cardNum.contains(14));
        return cardNum.contains(14);
    }
}
