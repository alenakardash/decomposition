package com.company.training.decomposition;

// Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

public class Task5 {
	
	public static void main(String[] args) {
		  int a;
		  int b;
		  int c;
		  
		  a = 23;
		  b = 45;
		  c = 0;
		  
		  int maximum;
		  int minimum;
		  int sum;
		  
		  maximum = max(a, b, c);
		  minimum = min(a, b, c);
		  
		  sum = maximum + minimum;
		  
		  System.out.println(sum);
		  
		  
	}
	public static int max(int a, int b, int c) {
		 
		 int max;
		 
         if(a > b && a > c) {
        	 max = a;
         }
         
         else if (b > a && b > c) {
        	 max = b;
         }
         
         else {
        	 max = c;
        }
		 
		 return max;
		 
	 }
	
	public static int min(int a, int b, int c) {
		 
         int min;
		 
         if(a < b && a < c) {
        	 min = a;
         }
         
         else if (b < a && b < c) {
        	 min = b;
         }
         
         else {
        	 min = c;
        }
		 
		 return min;
		 
		 
	 }

}
