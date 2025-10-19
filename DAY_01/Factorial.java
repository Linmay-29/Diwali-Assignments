package com.demo.main;
import java.util.Scanner;

public class Factorial {
	static int FindFactorial(int n) {
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int Fact = FindFactorial(n);
		System.out.println(n+"! = "+Fact);
	}
	
}
