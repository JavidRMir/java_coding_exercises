package com.techreturners.exercise003;

import java.util.Arrays;
import java.util.List;

public class Exercise003 {

    String[] iceCreamFlavoursArray = {
            "Pistachio",
            "Raspberry Ripple",
            "Vanilla",
            "Mint Chocolate Chip",
            "Chocolate",
            "Mango Sorbet"
    };

//    List<String> iceCreamFlavoursList = Arrays.asList(
//            "Pistachio",
//            "Raspberry Ripple",
//            "Vanilla",
//            "Mint Chocolate Chip",
//            "Chocolate",
//            "Mango Sorbet");

    List<String> iceCreamFlavoursList = Arrays.asList(iceCreamFlavoursArray);

    int getIceCreamCode(String iceCreamFlavour) {

        int iceCreamCode = iceCreamFlavoursList.indexOf(iceCreamFlavour);

        if (iceCreamCode == -1) {
            throw new UnsupportedOperationException("Ice cream flavour not found");
        } else {
            return iceCreamCode;
        }
    }

    String[] iceCreamFlavours() {
        if (iceCreamFlavoursArray.length > 0) {
            return iceCreamFlavoursArray;
        } else {
            throw new UnsupportedOperationException(("No Ice cream flavours found"));
        }
    }

}
