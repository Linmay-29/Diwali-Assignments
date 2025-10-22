package com.demo.test;
import java.util.Scanner;
import com.demo.sevice.NumberService;
import com.demo.sevice.NumberServiceImpl;

public class NumberMenu {

	public static void main(String[] args) {
		NumberService nservice = new NumberServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice  = 0;
		do {
			System.out.println("1. Addition of two numbers\n2.  Print multiplication table of a number\n3. Print number pattern");
			System.out.println("4. Sum of digits of a number\n5. Find GCD and LCM of two numbers\n6. Exit");
			choice = sc.nextInt();
			switch(choice) {
				case 1->{
					System.out.println("Enter number type : \n1. Integer \n2. Double");
					int type = sc.nextInt();
					if(type == 1) {
						System.out.println("Enter 1st number: ");
						int n1 = sc.nextInt();
						System.out.println("Enter 2nd number: ");
						int n2 = sc.nextInt();
						Double sum = nservice.AdditionOfTwoNumbers(n1,n2);
						System.out.println("Addition of "+n1+" and "+n2+" : "+sum);
					}else if (type == 2) {
						System.out.println("Enter 1st number: ");
						Double n1 = sc.nextDouble();
						System.out.println("Enter 2nd number: ");
						Double n2 = sc.nextDouble();
						Double sum = nservice.AdditionOfTwoNumbers(n1,n2);
						System.out.printf("Addition of %.5f and %.5f : %.5f%n", n1, n2, sum);
					}
				}
				case 2->{
					System.out.println("Enter a number: ");
					int n = sc.nextInt();
					nservice.MultiplicationTabel(n);
				}
				case 3->{
					System.out.println("Enter Rows: ");
					int r = sc.nextInt();
					nservice.PrintPattern(r);
				}
				case 4->{
					System.out.println("Enter a number: ");
					int n = sc.nextInt();
					int sum = nservice.SumOfDigits(n);
					System.out.println("Sum of digits of "+n+" : "+sum);
				}
				case 5->{
					System.out.println("Enter 1st number: ");
					int n1 = sc.nextInt();
					System.out.println("Enter 2nd number: ");
					int n2 = sc.nextInt();
					int GCD = nservice.FindGCD(n1,n2);
					int LCM = nservice.FindLCM(n1,n2);
					System.out.println("GCD is: "+GCD+"\nLCM is: "+LCM);
				}
				case 6->{
					System.out.println("Thanks for visiting...");
				}
				default->{
					System.out.println("Invalid choice");
				}
			}
		}while(choice!=6);
		

	}

}
