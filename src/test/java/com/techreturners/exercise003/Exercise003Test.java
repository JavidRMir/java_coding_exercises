package com.techreturners.exercise003;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class Exercise003Test {

    private Exercise003 ex003;

    @Before
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkPickMultipleIceCreamFlavours() {

//        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

        // deprecated
//        assertEquals(expected, ex003.iceCreamFlavours());

        // Use instead of String[], assertThat takes list as an iterative and not native array
        List<String> expected = Arrays.asList(
                "Pistachio",
                "Raspberry Ripple",
                "Vanilla",
                "Mint Chocolate Chip",
                "Chocolate",
                "Mango Sorbet");

        assertThat(expected, Matchers.containsInAnyOrder(ex003.iceCreamFlavours().toArray()));

    }

}
