package fr.diginamic.testexceptions;

public class Operation {

	// Exo1 : Affichage d'une exception avec throws

//	public double diviser(int a, int b) throws Exception {
//
//		if (b == 0) {
//			throw new Exception();
//		}
//		return a / b;
//	}

	public static double diviserRuntime(int a, int b) {

		if (b == 0) {
			throw new RuntimeException("La valeur b ne doit pas etre nulle");
		}
		return (double) a / (double) b;
	}

}
