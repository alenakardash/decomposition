package com.company.training.decomposition;

/* Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
если угол между сторонами длиной X и Y— прямой.
*/


public class Task12 {
	
	public static void main(String[] args) {
		
		double x = 4;
		double y = 6;
		double z = 7;
		double t = 6;
		
		double hypotenuse;
		
		hypotenuse = calcHypotenuse(x, y);
		
		double areaRightTriangle;
		double areaTriangle;
		double rectangleArea;
		
		areaRightTriangle = calcRightTriangleArea(x, y);
		
		
		areaTriangle = calcTriangleArea(z, t, hypotenuse);
		
		rectangleArea = calcRectangleArea(areaRightTriangle, areaTriangle);
		
		printResult(rectangleArea);
		
	}
	
	public static double calcHypotenuse(double a, double b) {
		 double hypoten;
		 
		 hypoten = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		return hypoten;
	}
	
	public static double calcTrianglePerimeter(double a, double b, double c) {
		double perimeter;
		
		 perimeter = a + b + c;
		 
		 return perimeter;
	}
	
	public static double calcRightTriangleArea(double a, double b) {
		double area;
		
		area = 0.5 * a * b;
		
		return area;
	}
	
	public static double calcTriangleArea(double a, double b, double c) {
		 double semiperim;
		 double area;
		 
		 semiperim = calcTrianglePerimeter(a, b, c) / 2;
		 
		 area = Math.sqrt(semiperim * (semiperim - a) * (semiperim - b) * (semiperim - c));
		 
		 return area;
	}
	
	public static double calcRectangleArea(double areaTriangle1, double areaTriangle2) {
		 double area;
		 
		 area = areaTriangle1 + areaTriangle2;
		 
		 return area;
	}
	
	public static void printResult(double result) {
		System.out.print("Площадь прямоугольника = " + result);
	}

}
