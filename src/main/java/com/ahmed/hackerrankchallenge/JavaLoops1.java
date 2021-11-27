package com.ahmed.hackerrankchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project:     javaChallengeHackerRank
 * Package:     com.ahmed.hackerrankchallenge
 * Created:     11/28/2021 01:07
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */
public class JavaLoops1 {
    public static void main(String[] args) throws IOException {
        // Here we used bufferReader and InputStreamReader. it's the same as Scanner...
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }
        bufferedReader.close();
    }
}
