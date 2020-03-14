package com.company.training.decomposition;

/*
 Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также, сколько 
 четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 
 */

public class Task19 {
	
	public static void main(String[] args) {
		int n = 2;
		int sum;
		int chet;
		
		int[] mas = {23, 44, 567, 22, 12, 123, 77, 88, 90, 93, 33};
		
		sum = calcSumOfNechet(mas, n);
		
		chet = calcChetNumb(sum);
		
		printResult(n, sum, chet);
	}
	
public static int sum(int a, int b) {
	int sum;
	sum = a + b;
	
	return sum;
	
}

public static int calcChetNumb(int number) {
	int digit;
	int count = 0;
	
	while(number > 0) {
		digit = number % 10;
		number /= 10;
		
		if(digit % 2 == 0) {
			count++;
		} 
	}
	return count;
}

public static int digitQuantity(int number) {
	int quantity = 0;
	
	while(number > 0) {
		number /= 10;
		quantity++;
	}
	return quantity;
}

public static boolean ifNechet(int number) {
	int count = 0;
	int digit;
	boolean ifNechet = false;
	
	while(number > 0) {
		digit = number % 10;
		number /= 10;
		if(digit % 2 == 0) {
			count++;
		}
		
		if(count == 0) {
			ifNechet = true;
		}
		else {
			ifNechet = false;
		}
	}
	return ifNechet;
}

public static int calcSumOfNechet(int[]arr, int n) {
	int sum = 0;
	
	for(int i = 0; i < arr.length; i++) {
		if(ifNechet(arr[i]) == true && digitQuantity(arr[i]) == n) {
			
			sum = sum(sum, arr[i]);
		}
	}
	return sum;
}

public static void printResult(int n, int sum, int chet) {
	System.out.println("Сумма " + n + "-значных чисел, содержащих только нечетные цифры, = " + sum);
	System.out.println("Сумма четных чисел в найденной сумме = " + chet);
}
}
