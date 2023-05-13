package gr.upatras.first;

public class SignClass {
	public static String signMethod(double a, double b) {
		double result = a - b;
		if(result>= 0) {
			return "POSITIVE";
		}
		else {
			return "NEGATIVE";
		}
	}
}
