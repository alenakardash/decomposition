package com.company.training.decomposition;

// Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.


public class Task4 {
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		a = 12;
		b = 9;
		c = 6;
		
		int leastCommMultfor2 = leastCommMultiple(a, b);
		
		int leastCommMultfor3 = leastCommMultiple(leastCommMultfor2, c);
		
		System.out.println("Наименьшее общее кратное трех чисел = " + leastCommMultfor3);
	
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
