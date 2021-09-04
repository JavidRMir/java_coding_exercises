package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        if(input.length() < 26) {
            return false;
        } else {
            for(char ch = 'a'; ch <= 'z'; ch++) {
                if(input.indexOf(ch) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

}
