package com.demo.main;

import java.util.Scanner;

public class IsPrime {
	
	static boolean IsPrime(int n) {
		for(int i = 2 ; i<n;i++ ) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		boolean status = IsPrime(n);
		if(status) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
	}

}
