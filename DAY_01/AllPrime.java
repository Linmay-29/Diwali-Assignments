package com.demo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllPrime {

    static List<Integer> CheckPrime(int n) {
        List<Integer> lst = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                lst.add(i);
            }
        }

        return lst;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number");
        int n = sc.nextInt();
        List<Integer> primes = CheckPrime(n);
        System.out.println("Prime numbers up to " + n + ": " + primes);
    }
}
