package com.company.training.decomposition;

import java.util.Random;

/* Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. 
Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
*/

public class Task11 {
	
	public static void main(String[] args) {
		
		int[] mas;
		int sum;
		
		mas = initArrayRandom(7);
		
		sum = calcSumOfElem(mas, 3, 5);
		
		printSum(sum);
		
		
	}
	
	public static int[] initArrayRandom(int n) {
		
		int[] arr = new int[n];
		
		Random rand = new Random();
	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
			
		}
		
		return arr;
		
	}
	
	public static int calcSumOfElem(int[] arr, int k, int m) {
		
		int sum = 0;
		
		for(int i = k; i <= m; i++) {
			sum+= arr[i];
			
		}
		
		return sum;
		}
	
	public static void printSum(int sum) {
		System.out.print("Сумма элементов массива = " + sum);
	}

}
