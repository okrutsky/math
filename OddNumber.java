package Algorithms;

import java.util.Scanner;

public class OddNumber {
	
	public static boolean isOdd(int number) {
		return number % 2!= 0;
	}
	
	public static void main(String[] args) {		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
		
			if (isOdd(number)) {
				System.out.println("The number is odd.");
			} else {
				System.out.println("The number is even.");
			}
		}
	}

}
