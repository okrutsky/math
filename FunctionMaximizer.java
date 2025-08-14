public class FunctionMaximizer {
	
	public static double f(double x, double a, double b) {
		return Math.pow(x, a) * Math.pow(1-x, b);
	}
	
	public static double derivative(double x, double a, double b) {
		return Math.pow(x, a-1)* Math.pow(1-x, b-1) * (a-(a+b)*x);
	}
	
	public static void main(String[] args) {
		double a = 2.0; // TODO code inputs system.in
		double b = 3.0;
		
		// Critical point
		
		double xStar = a / (a+b); // TODO write functions
		
		// Maximum value
		
		double maxVal = f(xStar, a,b);
		
		System.out.printf("Critical point x* = %.4f%n", xStar);
		System.out.printf("Maximum value f(x*) = %.4f%n", maxVal);
		
	}

}

