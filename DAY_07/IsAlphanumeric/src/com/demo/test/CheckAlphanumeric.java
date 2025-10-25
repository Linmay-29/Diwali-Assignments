package com.demo.test;

import java.util.Scanner;

public class CheckAlphanumeric {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a string.");
        String str = sc.next();

        if (str.matches("[a-zA-Z0-9]+")) {
            System.out.println("String is alphanumeric");
        } else {
            System.out.println("String is not alphanumeric");
        }
    }
}
