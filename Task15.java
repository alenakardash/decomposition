package com.company.training.decomposition;
import java.util.Random;

/* Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются 
числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task15 {
	
	public static void main(String[] args) {
		 int k = 10;
		 int n = 80;
		 int[] mas;
		 int numberOfElem = 5;
		 
		 mas = createArray(k, n, numberOfElem);
		 
		 printArray(mas);
		 
	}
	
	public static int sumOfDigits(int number) {
		int sum = 0;
		int digit;
		
		while(number > 0) {
			digit = number % 10;
			
			sum+= digit;
			
			number /= 10;	
		}
		return sum;
	}
	
	public static boolean ifEqual(int a, int b) {
		boolean ifEq;
		
		if (a == b) {
			ifEq = true;
		}
		else {
			ifEq = false;
		}
		return ifEq;
	}
	
	public static int[] createArray(int k, int n, int numberOfElem) {
        Random rand = new Random();
		 
		 int[] arr = new int[numberOfElem];
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 int candidate = rand.nextInt(n + 1);

			 while (!ifEqual(sumOfDigits(candidate), k)) {
				 candidate = rand.nextInt(n + 1);
		 }
		 
		      arr[i] = candidate;
		 }
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++)
		System.out.print(arr[i] + " ");
	}
	

}
