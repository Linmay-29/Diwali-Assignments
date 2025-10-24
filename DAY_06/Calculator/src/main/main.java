package main;

import java.util.Scanner;

import study.Calculator;
import study.WrongOperatorException;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = null;
		do {
			System.out.println("Enter 1st number:");
			int n1 = sc.nextInt();
			System.out.println("Enter 2nd number:");
			int n2 = sc.nextInt();
			System.out.println("Enter the operator:");
			String op = sc.next();
			try {
				int result = Calculator.calculate(n1,n2,op);
				System.out.println("Result:"+result);
			}catch(ArithmeticException e){
				System.out.println("Error: "+e.getMessage());
			}catch(WrongOperatorException e) {
				System.out.println("Error" + e.getMessage());
			}
			System.out.println("Do you want to continue(y/n):");
			ans = sc.next();
			if(ans.equals("n")) {
				System.out.println("Thanks for visiting...");
			}
			
		}while(!ans.equals("n"));
	}

}
