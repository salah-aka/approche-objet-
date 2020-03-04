package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

/**
 * @Affichage de resultat en appelant la méthode Compte
 *
 */
public class TestBanque {

	public static void main(String[] args) {
		Compte info = new Compte ("A3453" , 200000); 
		System.out.println (info);
	}

}
