package utils;
import java.lang.Integer;

public class executableConversionNombre {

	

	/**
	 * Apparition d'un nombre ewxprimer dans une chaine de caractère en nombre entier affiché
	 */
	public static void main(String[] args) {
		String chaine = "29";
	int number = Integer.valueOf(chaine);
	System.out.println (number);
  /**
   * Méthode pour trouver le maximum entre 2 nombres entiers
   */
    int a= 50, b=120;
    int max = Integer.max(a, b);
	System.out.println (" Le nombre maximum entre " + a + " et " + b + " c'est " +  max);
	
	


	}
}
