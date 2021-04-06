package com.wiwatyooraks.java1lab3;

public class lab3 {
	public static void main(String[] args) {
		int ai = 20;
		int bi = 20;
		float aFloat = 5.5f;
		float bFloat = 1.1f;
		char aChar ='\u0001';
		char bChar ='\u1000';
		ai++;
		ai++;
		ai++;
		ai++;
		ai++;
		--bi;
		--bi;
		--bi;
		--bi;
		--bi;
		System.out.println("lab3r1 a : " + ai);
		System.out.println("lab3r1 b : " + bi);
		if ((aFloat == 5.5f) && (bFloat == 1.1f))
		System.out.println("lab3r2 : " + "true");
		if ((aChar == '\u0001') || (bChar == '\u1000'))
		System.out.println("lab3r3 : " + "false");
	}
}
