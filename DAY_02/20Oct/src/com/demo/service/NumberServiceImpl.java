package com.demo.service;

public class NumberServiceImpl implements NumberService {

	@Override
	public int SumOfEven(int num) {
		int sum = (num) * (num + 1);
		return sum;
	}

	@Override
	public int SumOfOdd(int num) {
		int sum = num*num;
		return sum;
	}

	@Override
	public boolean IsPalindrome(int num) {
		int lastdigit = 0;
		int revNum = 0;
		int temp = num;
		while(temp!=0) {
			lastdigit = temp%10;
			revNum = (revNum*10)+lastdigit;
			temp /= 10;
		}
		return num==revNum;
	}

	@Override
	public boolean IsArmstrong(int num) {
		int digitCnt=0;
		int temp = num;
		while(temp!=0) {
			temp/=10;
			digitCnt++;
		}
		int temp1 = num;
		int sum = 0;
		int lastDigit = 0;
		while(temp1!=0) {
			lastDigit = temp1%10;
			int product = 1;
			for(int i = 1 ; i<=digitCnt;i++) {
				product *= lastDigit; 
			}
			temp1 /= 10;
			sum += product;	
		}
		return num==sum;
	}

	@Override
	public int RevNumber(int num) {
		int lastdigit = 0;
		int revNum = 0;
		int temp = num;
		while(temp!=0) {
			lastdigit = temp%10;
			revNum = (revNum*10)+lastdigit;
			temp /= 10;
		}
		return revNum;
	}

	
}
