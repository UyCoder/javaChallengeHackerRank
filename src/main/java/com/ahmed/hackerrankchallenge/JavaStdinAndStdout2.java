package com.ahmed.hackerrankchallenge;

import java.util.Scanner;

/**
 * Project:     javaChallengeHackerRank
 * Package:     com.ahmed
 * Created:     11/28/2021 00:39
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */
public class JavaStdinAndStdout2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}
