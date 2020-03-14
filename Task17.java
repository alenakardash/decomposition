package com.company.training.decomposition;

/* Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. 
Для решения задачи использовать декомпозицию.
*/

public class Task17 {
	
	public static void main(String[] args) {
		
		int k = 500;
		int[] mas;
		
	mas = createArray(k);
		
	printArmstrongNumberFromArray(mas);
	
	}
	
	public static int digitSum(int x) {
		int sum = 0;
		
		int digit;
		
		while(x > 0) {
			digit = x % 10;
			
			x/= 10;
			
			sum += digit;			
		}
		return sum;
	}
	public static double calcExponent(double x, double exponent) {
		double result = Math.pow(x, exponent);
		
		return result;
	}
	
	
	public static int digitNumb(int x) {
		int numb = 0;
		
		while(x > 0) {
			
			x/= 10;
			
			numb++;		
		}
		return numb;
	}
	
	public static int[] createArray(int elementQuantity) {
		
		int[] arr = new int[elementQuantity];
		
		int j = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = j;
			j++;
			
		}
		return arr;
		
	}
	
	public static int calcArmstrongAlgorithm(int number) {
		
		int pow = digitNumb(number);
		
		int digit;
		int sum = 0;
		
		while(number > 0) {
			digit = number % 10;
			number /= 10;
			
			sum += calcExponent(digit, pow);
		}
		return sum;
		
	}
	
	public static void printArmstrongNumberFromArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if (arr[i] == calcArmstrongAlgorithm(arr[i])) {
				
					System.out.print(arr[i] + " ");
					}
				}
		}
	}

