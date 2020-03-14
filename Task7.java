package com.company.training.decomposition;

/* На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
*/

public class Task7 {
	
	public static void main(String[] args) {
		
		double[][] arr = new double[2][5];
		
		createTableCoord5Dots(arr, 2, 1, 4, 1, 5, 3, 6, 4, 100, 200);
	    
	    
	     double max = 0;
	     
	     double dist;
	     dist = 0;
        
        int indexX1;
        int indexX2;
        
        indexX1 = 0;
        indexX2 = 0;
	    
	   for (int i = 0; i< arr[0].length; i++) {
		   
		   for (int j = i + 1; j < arr[0].length; j++) {
		   
	    	double xSide = arr[0][i] - arr[0][j];
	    	
	    	double ySide = arr[1][i] - arr[1][j];
	    	
	    	dist = distance(xSide, ySide);

	    	
	    	if (dist > max) {
	    		
	    		max = dist;
	    		
	    		indexX1 = i;
	    		indexX2 = j;
	    		
	    		}
	    	else {}
	    	
	    	
		   }

	    	}
	   
	   printCoordinates(arr,indexX1, indexX2);
	   
	   
		   }
	
	public static void printCoordinates(double[][] arr, int indexX1, int indexX2) {
		System.out.println("Координаты первого числа: x = " + arr[0][indexX1] + " y = " + arr[1][indexX1]);
		System.out.println("Координаты второго числа: x = " + arr[0][indexX2] + " y = " + arr[1][indexX2]);
	}
	
	public static double[][] createTableCoord5Dots(double[][] arr, double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5) {
		
		arr[0][0] = x1;
		arr[0][1] = x2;
	    arr[0][2] = x3;
	    arr[0][3] = x4;
	    arr[0][4] = x5;
	    arr[1][0] = y1;
		arr[1][1] = y2;
	    arr[1][2] = y3;
	    arr[1][3] = y4;
	    arr[1][4] = y5;
		
	    return arr;
	}
	
	
	public static double distance(double a, double b) {
		
		double distance = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return distance;
	}
	
	    }
	    