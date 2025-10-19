package com.demo.main;

import java.util.Scanner;

public class EvenOdd {

    static String CheckEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        String result = CheckEvenOdd(n);
        System.out.println(n + " is " + result);
    }
}
