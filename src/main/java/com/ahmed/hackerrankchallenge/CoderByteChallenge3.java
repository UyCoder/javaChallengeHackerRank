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
    public static boolean MathChallenge(int sayi) {
        for (int i = 2; i < Math.sqrt(sayi); i++) {
            if (sayi % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(s.nextInt())); // But if you want ot success in coderbte you need to chance s.nextLine()
    }
}

