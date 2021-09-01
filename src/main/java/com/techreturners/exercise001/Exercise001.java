package com.techreturners.exercise001;
import org.apache.commons.math3.util.Precision;


import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double result = (1 + vatRate/100) * originalPrice;
        // return Math.round(result *100.0)/100.0;
        return Precision.round(result, 2);
    }

    public String reverse(String sentence) {
        // Add your code here
        StringBuilder stringBuilderStr = new StringBuilder();
        stringBuilderStr.append(sentence);
        return String.valueOf(stringBuilderStr.reverse());
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int linuxUsers = 0;
        for (User user: users) {
            if (user.getType().equals("Linux")) {
                linuxUsers++;
            }
        }
        return linuxUsers;
    }
}
