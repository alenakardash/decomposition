package com.company.training.decomposition;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task9 {
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		a = 5;
		b = 7;
		c = 13;
		
		int greatCommFact = greatCommFactor(a, b, c);
		
		boolean result = ifSimple(greatCommFact);
		
		printResult(result);
		
		
	}
	public static int min(int a, int b, int c) {
		 
		 int min;
		 
         if(a < b && a < c) {
        	 min = a;
         }
         else if(b < c && b < a) {
        	 min = b;
         }
         else {
        	 min = c;
         }
		 
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
   
   public static int greatCommFactor(int a, int b, int c) {
  	 
		int n = min(a, b, c);
		
	    int max;
	    
		max = 1;
		
		for (int i = 1; i <= n; i++) {
			
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				
				max = max(i, max);
			}
			
			else {}
			
		}
		
		return max;
  	 
   }
   
   public static boolean ifSimple(int greatCommFactor) {
	   
	   boolean ifSimple;
	   
	   if (greatCommFactor == 1) {
		   ifSimple = true;
	   }
	   
	   else {
		   ifSimple = false;
	   }
	   return ifSimple;
   }
   
   public static void printResult(boolean ifSimple) {
	   
	   if (ifSimple == true) {
		   
		   System.out.print("Числа являются взаимно простыми");
	   }
	   else {
		   System.out.print("Числа не являются взаимно простыми");
	   }
	   
   }

}
