package com.company.training.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.


public class Task3 {
	
	public static void main(String[] args) {
		
		int a, b, c, d;
		
		a = 10;
		b = 15;
		c = 20;
		d = 25;
		
		int greatCommFactor2Val;
		int greatCommFactor3Val;
		int greatCommFactor4Val;
		
		greatCommFactor2Val = greatCommFactor(a, b);
		greatCommFactor3Val = greatCommFactor(greatCommFactor2Val, c);
		greatCommFactor4Val = greatCommFactor(greatCommFactor3Val, d);
		
		System.out.println("Наибольший общий делитель чисел " + a + " " + b + " " + c + " " + d + " = " + greatCommFactor4Val);
		
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
    

}
