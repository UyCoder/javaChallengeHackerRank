package com.ahmed.hackerrankchallenge;

import java.util.Scanner;

/**
 * Project:     javaChallengeHackerRank
 * Package:     com.ahmed.hackerrankchallenge
 * Created:     11/28/2021 00:51
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");

        /**
         * System.out.printf("%-15s%03d\n",s1,x);
         * %s is used for string so,
         * %-15s --> is used for -15 spaces right side for string
         * same as
         * %d is used for int
         * %03 --> used for 3 spaces left side for int with starting 0
         */
    }
}
