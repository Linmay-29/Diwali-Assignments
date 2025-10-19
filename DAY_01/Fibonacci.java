package com.demo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    static List<Integer> FindFibonacci(int n) {
        List<Integer> lst = new ArrayList<>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            lst.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

        return lst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();
        List<Integer> fibonacci = FindFibonacci(n);
        System.out.println("Fibonacci series up to " + n + " terms: " + fibonacci);
    }
}
