package com.company.training.decomposition;

// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task6 {
	
	public static void main(String[] args) {
		
		double a;
		
		a = 3;
		
		double hexagonArea;
		
		hexagonArea = calcHexagonArea(a);
		
		System.out.println("Площадь правильного шестиугольника = " + hexagonArea);
		
       }
	
	public static double calcTriangleArea(double a) {
		
		double area;
		
		area = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		
		return area;
	}
	
    public static double calcHexagonArea(double a) {
		
		double hexagonArea;
		
		double triangleArea = calcTriangleArea(a);
		
		hexagonArea = 6 * triangleArea;
		
		return hexagonArea;
	}

}
