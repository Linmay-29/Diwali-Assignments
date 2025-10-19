package com.demo.main;

import java.util.Scanner;

public class LongestStringLength {

    static String findLongestString(String[] arr) {
        String longest = "";
        for (String s : arr) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String longest = findLongestString(arr);
        System.out.println("Longest string: " + longest);
        System.out.println("Length of longest string: " + longest.length());
    }
}
