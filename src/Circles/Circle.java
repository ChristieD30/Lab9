package Circles;

import java.util.Scanner;

public class Circle {
	private double radius;

	public Circle(double rad) {
	   radius = rad;

	}
	
	public Circle() {
		
	}

	public double getCircumference() {

		return 2 * radius * Math.PI;
	}

	public double getArea() {

		return radius * radius * Math.PI;

	}

	public String getFormattedCircumference() {
		
		return formatNumber(getCircumference()) ;
		
	}
	
	public String getFormattedArea() {
		
		return formatNumber(getArea());
	}
	
	
	private String formatNumber(double x) {
		
	  Double.toString(x);
	  
		return   String.format ("%.2f", x );
		
	}
	
	
	
	
}

