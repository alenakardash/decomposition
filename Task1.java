package com.company.training.decomposition;

// Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

public class Task1 {
	
	public static void main(String[] args) {
		
		double x1, y1;
		double x2, y2;
		double x3, y3;
		
		
		x1 = 1;
		y1 = 2;
		x2 = 6;
		y2 = 2;
		x3 = 4;
		y3 = 5;
		
		
        double c1, c2, c3;
        double area;
        
        
		c1 = calcTriangleHypotenuse(x1, y1, x2, y2);
		
		c2 = calcTriangleHypotenuse(x2, y2, x3, y3);
		
		c3 = calcTriangleHypotenuse(x1, y1, x3, y3);
		
		area = calcTriangleArea(c1, c2, c3);
		
		System.out.print("Triangle area = " + area);
		
	}
	
		
		public static double calcTriangleHypotenuse(double x1, double y1, double x2, double y2) {
			
			double a, b, c;
			
			a = x2 - x1;
			
			b = y2 - y1;
			
			c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			
		    return c;
		}
		
		public static double calcTrianglePerimeter(double a, double b, double c) {
			
			double perimeter;
			
			perimeter = a + b + c;
			
			return perimeter;
		}
		
		public static double calcTriangleArea(double a, double b, double c) {	
			
			double p = calcTrianglePerimeter(a, b, c);
			
			double semiperimeter = p/ 2;
			
			double area = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
			
			return area;
		}
		
	
	}

