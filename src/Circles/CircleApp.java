package Circles;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		String yesNo; 
	Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Circle Calculator.");
	do{
	double userNum = Validator.getDouble(scan, "Please enter a radius for a circle. ");
	 
	Circle circle = new Circle(userNum);
	
	System.out.println("Circumference is: " + circle.getFormattedCircumference());
	System.out.println("Area is: " + circle.getFormattedArea());
	
	yesNo = Validator.getString(scan, "Would you like to continue? y/n ");
	
	} while(yesNo.equalsIgnoreCase("y"));
	
	System.out.println("Thank you for using the Circle Calculator. ");
	}

}


