package com.ahmed.hackerrankchallenge;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Project:     javaChallengeHackerRank
 * Package:     com.ahmed.hackerrankchallenge
 * Created:     11/28/2021 02:15
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */
public class CoderByteChallenge1 {
    // First method to convert String to Camel case, But with first letter uppercase
            public static String convertToCamelCase(String value) {
                StringBuilder returnValue = new StringBuilder();
                String throwAwayChars = "()[]{}=?!.:,-_+*#~/%";
                value = value.replaceAll("[" + Pattern.quote(throwAwayChars) + "]", " ");
                value = value.toLowerCase();
                boolean makeNextUppercase = true;
                for (char c : value.toCharArray()) {
                    if (Character.isSpaceChar(c) || Character.isWhitespace(c)) {
                        makeNextUppercase = true;
                    } else if (makeNextUppercase) {
                        c = Character.toTitleCase(c);
                        makeNextUppercase = false;
                    }
                    returnValue.append(c);
                }
                return returnValue.toString().replaceAll("\\s+", "");
            }
    // Second method will convert first letter to lower case
    public static String firstCharToLowerCase(String str) {
        if(str == null || str.length() == 0)
            return "";
        if(str.length() == 1)
            return str.toLowerCase();
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    // Main method here..
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println(firstCharToLowerCase(convertToCamelCase(scan.nextLine())));
        scan.close();
    }
}


