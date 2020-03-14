package com.company.training.decomposition;

/* 
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
               A * B
НОК(A, B) = ------------
             НОД (А, B)
 */

public class Task2 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = 12;
		b = 9;
		
		int greatCommFact = greatCommFactor(a, b);
		
		System.out.println("Наибольший общий делитель = " + greatCommFact);
		
		int leastCommMult = leastCommMultiple(a, b);
		
		System.out.println("Наименьшее общее кратное = " + leastCommMult);
		
		
	}
	 public static int min(int a, int b) {
		 
		 int min;
		 
		 if(a < b) {
			min = a; 
		 }
		 
		 else {
			 min = b;}
		 
		 return min;
		 
	 }
	 
     public static int max(int a, int b) {
		 
		 int max;
		 
		 if(a > b) {
			max = a; 
		 }
		 
		 else {
			 max = b;}
		 
		 return max;
		 
	 }
     
     public static int greatCommFactor(int a, int b) {
    	 
		int n = min(a, b);
		
	    int max;
	    
		max = 1;
		
		for (int i = 1; i <= n; i++) {
			
			if (a % i == 0 && b % i == 0) {
				
				max = max(i, max);
			}
			
			else {}
			
		}
		
		return max;
    	 
     }
     
     public static int leastCommMultiple(int a, int b) {
    	 
    	 int temp = greatCommFactor(a, b);
    	 
    	 int res = a * b / temp;
    	 
    	 return res;
    	 
     }
	
	
}