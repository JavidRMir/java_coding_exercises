package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Exercise003 {

    Map<String, Integer> iceCreamFlavoursMap = Map.of(
            "Pistachio", 0,
            "Raspberry Ripple", 1,
            "Vanilla", 2,
            "Mint Chocolate Chip", 3,
            "Chocolate", 4,
            "Mango Sorbet", 5);

    int getIceCreamCode(String iceCreamFlavour) {

        Integer iceCreamCode = iceCreamFlavoursMap.get(iceCreamFlavour);

        if (iceCreamCode == null) {
            throw new NullPointerException("Ice cream flavour not found");
        } else {
            return iceCreamCode;
        }
    }

    
    List<String> iceCreamFlavours() {
        return new ArrayList<>(iceCreamFlavoursMap.keySet());
    }

}
