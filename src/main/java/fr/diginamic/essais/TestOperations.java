package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		Operations op = new Operations();
		   double add = op.Calcul(4, 2, '+');
		   double soustr = op.Calcul(4, 2, '-');
		   double mult = op.Calcul(4, 2, '*');
		   double div = op.Calcul(4, 2, '/');

	   System.out.println("Le surface de la cercle est " + add);
	   System.out.println("Le surface de la cercle est " + soustr);
	   System.out.println("Le surface de la cercle est " + mult);
	   System.out.println("Le surface de la cercle est " + div);


	}

}
