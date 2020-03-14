package com.company.training.decomposition;

/* Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются 
цифры числа N.
 */

public class Task13 {
	
	public static void main(String[] args) {
		
		int number = 23456;
		
		int[] mas;
		
		mas = createArrayFromNumber(number);
		
		printArrayElem(mas);
		
		
	}
	
	
public static int findNumberOfArrElem(int number) {
	
	int n = 0;
	int temp;
	
	temp = number;
	
	while(temp > 0) {
		temp /= 10;
		n++;
	}
	return n;
	
}

public static int[] createArrayFromNumber(int number) {
	
	int elementsNumber;
	
	elementsNumber = findNumberOfArrElem(number);
	
	int[] mas = new int[elementsNumber];
	
	
	 for(int i = mas.length - 1; i >= 0; i--) {
		 
		 mas[i] = number % 10;
		 number/= 10;
		 
	 }
	 
	 return mas;
}

public static void printArrayElem(int[] arr) {
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	
}
}
