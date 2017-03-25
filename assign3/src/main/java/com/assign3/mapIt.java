package com.assign3;

/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */
import java.util.*;

public class mapIt {

    private Map<Long, String> scarfDetail = new HashMap<Long, String>();

    private String colours[] = {"magentaRed", "aquaBlue", "orchidYellow"};
    private long barcode[] = {12345678, 24681012, 13691215};

    public mapIt() {
        for (int i = 0; i < 3; i++) {

            scarfDetail.put(barcode[i], colours[i]);
        }
        System.out.println("Locate: " + scarfDetail + " " + scarfDetail.size());
    }

    public boolean findScarf() {
        return scarfDetail.containsValue("magentaRed");
    }
}