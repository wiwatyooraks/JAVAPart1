package com.wiwatyooraks.java1lab2;

public class lab2r2 {
	public static void main(String[] args) {
		
		float myFloat = 5.5f;
		int myInt = (int) myFloat;
		System.out.println("myFloat value: " + myFloat);
		System.out.println("myInt value: " + myInt);
		
		int newInt = 5;
		float newFloat = newInt;
		System.out.println("newInt value: " + newInt);
		System.out.println("newFloat value: " + newFloat);
		
		double myDouble = 0.0d; 
		float otherFloat = (float) myDouble;
		System.out.println("myDouble value: " + myDouble); 
		System.out.println("otherFloat value: " + otherFloat);
		
		char myChar = '\u0000'; 
		int otherInt = (int) myChar;
		System.out.println("myChar value: " + myChar); 
		System.out.println("otherInt value: " + otherInt);
		
	}
}
