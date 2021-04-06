package com.wiwatyooraks.java1lab4;

public class lab4r1 {
	public static void main(String[] args) {
		int score = 45;
		if ( score < 50 ) {
			System.out.println("Fail !!");
		} else if ( score >= 50 && score < 80 ) {
			System.out.println("Normal --");
		} else if ( score >= 80 ) {
			System.out.println("Good ++");
		}
	}
}
