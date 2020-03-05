package fr.diginamic.operations;

public class Operations {

	public double a;
	public double b;

	public static double Calcul(double a, double b, char c) {
		if (c == '+') {
			return a + b;
		}else if (c == '*'){
			return a * b;
		}else if (c == '/'){
			return a / b;
		}else {
			return a - b;
		}
		
		}
		
	}

