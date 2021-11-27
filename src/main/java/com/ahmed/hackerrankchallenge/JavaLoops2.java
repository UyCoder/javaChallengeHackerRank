package com.ahmed.hackerrankchallenge;

import java.util.Scanner;

/**
 * Project:     javaChallengeHackerRank
 * Package:     com.ahmed.hackerrankchallenge
 * Created:     11/28/2021 01:10
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */
public class JavaLoops2 {
    // ==========================================  solution 1
//    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//        }
//        in.close();
//    }


    // ==========================================  solution 2
public static void main(String []argh){
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    for(int i=0;i<t;i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        for(int j = 0; j < n; j++){
            a = a + (int)Math.pow(2,j)*b;
            System.out.print(a + " ");
        }
        System.out.println("");
    }
    in.close();
}
}
