package com.wiwatyooraks.java1lab910;

public class lab10 {
	public static void main(String[] args) {
		for (int counter_1 = 0; counter_1 < 10; counter_1++ ) {
		for (int counter_2 = 0; counter_2 < 10; counter_2++ ) {
		if ( counter_1 == 2 || counter_2 == 2 )
		continue;
		System.out.println("Counter 1: " + counter_1
		+ " " + "Counter 2: " + counter_2);
		}
	}
	}
}
