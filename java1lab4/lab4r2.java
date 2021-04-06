package com.wiwatyooraks.java1lab4;

public class lab4r2 {
	public static void main(String[] args) {
		int isHandSome = 1;
		int score = 65;
		if ( isHandSome == 1 ) {
			System.out.println("Very Good");
		} else if ( score < 50 ) {
			System.out.println("Fail !!");
		} else if ( score >= 50 && score < 80 ) {
			System.out.println("Normal --");
		} else if ( score >= 80 ) {
			System.out.println("Good ++");
		}
	}
}
