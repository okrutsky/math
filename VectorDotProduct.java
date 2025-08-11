package math;

import java.util.Scanner;

/*
 * Training class for learning Vectors and Math.
 * 
 * @author Ondrej Krutsky
 */
public class VectorDotProduct {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter vector size: ");
		int size = scanner.nextInt();
		
		double[] vector1 = new double[size]; // creates Vector 1
		double[] vector2 = new double[size]; // creates Vector 2
		
		System.out.println("Enter elements of first vector: ");
		for(int i = 0; i<size; i++) {
			vector1[i] = scanner.nextDouble();
		}
		
		System.out.println("Enter elements of second vector: ");
		for(int i = 0; i<size; i++) {
			vector2[i] = scanner.nextDouble();
		}
		
		double dotProduct = 0;
		for(int i = 0; i<size; i++) {
			dotProduct += vector1[i] * vector2[i];
		}
		
		System.out.println("Dot product is: " + dotProduct);
	}

}
