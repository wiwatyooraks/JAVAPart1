package com.wiwatyooraks.java1lab5;

public class lab5 {
	public static void main(String[] args) {
		int score = 70;
		switch (score) {
		case 80 : 
			System.out.println("Score " + score + " = Grade A"); break;
		case 70 : 
			System.out.println("Score " + score + " = Grade B"); break;
		case 60 : 
			System.out.println("Score " + score + " = Grade C"); break;
		case 50 : 
			System.out.println("Score " + score + " = Grade D"); break;
		case 40 : 
			System.out.println("Score " + score + " = Grade F"); break;
		default : 
			System.out.println("Score " + score + " = Grade E" + " or change score ");
		}
	}
}
