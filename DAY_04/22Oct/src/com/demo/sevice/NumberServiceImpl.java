package com.demo.sevice;

public class NumberServiceImpl implements NumberService {

	@Override
	public <T extends Number> Double AdditionOfTwoNumbers(T n1, T n2) {
		return n1.doubleValue() + n2.doubleValue();
	}

	@Override
	public void MultiplicationTabel(int n) {
		for(int i = 1;i<=10;i++) {
			System.out.println(n+" x "+i+" = "+ n*i);
		}
		
	}

	@Override
	public void PrintPattern(int r) {
	    int cnt = 1;
	    for(int i = 0; i < r; i++) {
	        for(int j = 0; j < r - i - 1; j++) {
	            System.out.print(" ");
	        }
	        for(int k = 0; k < (2 * i + 1); k++) {
	            System.out.print(cnt);
	            cnt++;
	        }
	        System.out.println();
	    }
	}

	@Override
	public int SumOfDigits(int n) {
		int sum = 0;
		while(n!=0) {
			int lastDigit = n%10;
			sum += lastDigit;
			n /= 10;
		}
		return sum;
	}

	@Override
	public int FindGCD(int n1, int n2) {
	    n1 = Math.abs(n1);
	    n2 = Math.abs(n2);
	    if (n1 == 0) return n2;
	    if (n2 == 0) return n1;
	    while (n1 != n2) {
	        if (n1 > n2) {
	            n1 = n1 - n2;
	        } else {
	            n2 = n2 - n1;
	        }
	    }
	    return n1;
	}

	@Override
	public int FindLCM(int n1, int n2) {
		int GCD = FindGCD(n1,n2);
		int LCM = (n1*n2)/GCD;
		return LCM;
	}


	

}
