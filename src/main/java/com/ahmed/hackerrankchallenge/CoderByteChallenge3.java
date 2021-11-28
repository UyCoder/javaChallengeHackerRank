package com.ahmed.hackerrankchallenge;

import java.util.Scanner;

/**
 * Project:     javaChallengeHackerRank
 * Package:     com.ahmed.hackerrankchallenge
 * Created:     11/28/2021 03:59
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */
public class CoderByteChallenge3 {

    public static String MathChallenge(int sayi) {
        for (int i = 2; i < Math.sqrt(sayi); i++) {
            if (sayi % i == 0){
                return "false";
            }
        }
        return "true";
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(MathChallenge(scan.nextInt()));
    }
}

