package com.ahmed.hackerrankchallenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project:     javaChallengeHackerRank
 * Package:     com.ahmed.hackerrankchallenge
 * Created:     11/28/2021 03:21
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */
public class CoderByteChallenge2{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the two arrays");
        int size = scan.nextInt();
        int [] array1 = new int[size];
        int [] array2 = new int[size];
        int [] result = new int[size];

        System.out.println("Enter the elements of array 1");

        for (int i = 0; i < size; i++)
        {
            array1[i] = scan.nextInt();
        }

        System.out.println("Enter the elements of array 2");

        for (int i = 0; i < size; i++)
        {
            array2[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++)
        {
            result[i] = array1[i]+array2[i];
        }

        System.out.println("Sum of elements of array1 and array2");
        for (int i = 0; i < size; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}