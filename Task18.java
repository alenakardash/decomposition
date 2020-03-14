package com.company.training.decomposition;

import java.util.Random;

/* Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). 
Для решения задачи использовать декомпозицию.
*/

public class Task18 {
	
	public static void main(String[] args) {
		
		int elemNumber = 100;
		int[] mas;
		
		int n = 4;
		
		mas = createArrayRandom(elemNumber);
		
		printIncreaseVal(mas, n);
		
	}

	public static int[] createArrayFromNumber(int number) {
		
		int digit;
		
        int numOfElements = digitNumber(number);
		
		int[] arr = new int[numOfElements];
		
		for(int i = arr.length - 1; i >= 0; i--) {
		digit = number % 10;
		
		number /= 10;
		
		arr[i] = digit;
	}
		return arr;
		}
	
	public static int digitNumber(int number) {
		int numOfElem = 0;
		
		while(number > 0) {
			number /= 10;
			numOfElem++;
			
		}
		return numOfElem;
	}
	
	public static boolean ifIncrease(int[] arr) {
		boolean ifIncrease;
		int countFalse = 0;
		
		for(int i = 0; i < arr.length - 1; i++)
			
		if(arr[i] < arr[i + 1]) {
			
		}
		else {
			countFalse++;
		}
		
		if(countFalse > 0) {
			ifIncrease = false;
		}
		else {
			ifIncrease = true;
		}
		return ifIncrease;
	}
	
	public static int[] createArrayRandom(int numberElem) {
		
		Random ran = new Random();
		
		int[] arr = new int[numberElem];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10000);
		}
		return arr;
	}
	
	public static void printIncreaseVal(int[] arr, int n) {
		
		for(int i = 0; i < arr.length; i++) {
			
			int numb1[] = createArrayFromNumber(arr[i]);
			
			if (ifIncrease(numb1) == true) {
				
				if(digitNumber(arr[i]) == n) {
			
			System.out.print(arr[i] + " ");
			}
			}
			
			}
			
		}
	}

