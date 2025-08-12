public class Factorial {
	
	public int factorial(int n) {
		
		return(n== 1 || n == 0) ? 1 : n * factorial(n-1);
		
	}
	
	public static void main(String[] args) {

		Factorial f = new Factorial(); // creating and initializing object
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		int i = sc.nextInt(); // reading input from a user
		System.out.println("Factorial of " + i + "is " + f.factorial(i)); // calling a method and calculating		
	}
}

