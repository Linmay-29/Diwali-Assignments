package com.demo.sevice;

public interface NumberService {

	<T extends Number> Double AdditionOfTwoNumbers(T n1, T n2);

	void MultiplicationTabel(int n);

	void PrintPattern(int r);

	int SumOfDigits(int n);

	int FindGCD(int n1, int n2);

	int FindLCM(int n1, int n2);


}
