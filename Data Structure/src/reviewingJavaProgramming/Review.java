package reviewingJavaProgramming;

import java.util.*;

public class Review {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		int value = 0;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter a number from the keypad.");
		value = myObj.nextInt();
		print_evens(value);
	}

	public static void print_evens(int Value){
		int i = 0;
		while (i <= Value){
			System.out.print(i + " ");
			i = i+2;
		}
	}
}
