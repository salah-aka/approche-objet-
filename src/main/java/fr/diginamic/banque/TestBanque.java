package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * @Affichage de resultat en appelant la méthode Compte
 *
 */
public class TestBanque {

	public static void main(String[] args) {

		Compte compte = new Compte("A3453", 200000);

		CompteTaux compteTaux = new CompteTaux("V5653", 10000, 69);

		System.out.println(compteTaux);

		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte("A3453", 200000);
		comptes[1] = new CompteTaux("V5653", 10000, 69);

		double soldeGlobal = 0.0;
		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
			soldeGlobal += comptes[i].getSoldeCompte();
		}
		System.out.println(soldeGlobal);

	}

}
