package com.company.training.decomposition;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task10 {
	
	public static void main (String[] args) {
		
		int n = 9;
		
		int result;
		
		result = sumFactorialNechet(n);
		
		printResult(result);
		
	}
	
	
	public static int calcFactorial(int x) {
		
		int factorial = 1;
		
		  for (int i = 2; i <= x; i++) {

			  factorial *= i;
		  }
		  return factorial;
	}
	
	public static boolean ifNechet(int x) {
		
		boolean ifNechet;
		
		if (x % 2 == 0) {
			ifNechet = false;
		}
		else {
			ifNechet = true;
		}
		
		return ifNechet;
		
	}
	
	public static int sumFactorialNechet(int n) {
		
		int sum = 0;
		int fact;
	
	for (int i = 1; i <= n; i++) {
		
		if(ifNechet(i)) {
			
		fact = calcFactorial(i);
		
			sum+= fact;
		}
	}
	     return sum;
	}
	
	public static void printResult(int sumFactorials) {
		System.out.print("Сумма всех нечетных факториалов числа = " + sumFactorials);
	}

}
