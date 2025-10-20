package com.demo.test;
import java.util.Scanner;
import com.demo.service.NumberService;
import com.demo.service.NumberServiceImpl;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberService nservice = new NumberServiceImpl();
		int choice = 0;
		
		do {
			System.out.println("1. Sum of first n even numbers\n2. Sum of first n odd numbers\n3. Check if a number is a palindrome");
			System.out.println("4. Check if a number is an Armstrong number\n5. Reverse a number\n6. Exit");
			System.out.println("Select a option");
			choice = sc.nextInt();
			switch(choice) {
				case 1 ->{
					System.out.println("Enter a number: ");
					int num = sc.nextInt();
					int sum = nservice.SumOfEven(num);
					System.out.println("Sum of frist N even numbers: "+sum);
				}
				case 2 ->{
					System.out.println("Enter a number: ");
					int num = sc.nextInt();
					int sum = nservice.SumOfOdd(num);
					System.out.println("Sum of frist N odd numbers: "+sum);
				}
				case 3 ->{
					System.out.println("Enter a number");
					int num = sc.nextInt();
					boolean status = nservice.IsPalindrome(num);
					if(status) {
						System.out.println(num+" is palindrome");
					}else
					System.out.println(num+" is not palindrome");
				}
				case 4 ->{
					System.out.println("Enter a number");
					int num = sc.nextInt();
					boolean status = nservice.IsArmstrong(num);
					if(status) {
						System.out.println(num+" is an Armstrong number");
					}else
					System.out.println(num+" is not an Armstrong number");
				}
				case 5 ->{
					System.out.println("Enter a number: ");
					int num = sc.nextInt();
					int rev = nservice.RevNumber(num);
					System.out.println("Reverse of "+num+" is "+rev);
				}
				
				case 6 ->{
					System.out.println("ThankYou for visiting...");
				}
				default ->{
					System.out.println("Please enter the write choice");
				}
			}
			
		}while(choice!=6);
	}

}
