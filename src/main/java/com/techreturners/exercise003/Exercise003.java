package com.techreturners.exercise003;

import java.util.ArrayList;
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
        return iceCreamFlavoursMap.get(iceCreamFlavour);
    }

    List<String> iceCreamFlavours() {
        return new ArrayList<>(iceCreamFlavoursMap.keySet());
    }

}
