package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperationExcutable {

	public static void main(String[] args) {
		Operation[] tab = new Operation[4];
		tab[0] = new Debit("03/03/2020", 150.0);
		tab[1] = new Credit("03/03/2020", 45.0);
		tab[2] = new Credit("03/03/2020", 100.0);
		tab[3] = new Debit("03/03/2020", 90.0);

		double soldeGlobal = 0.0;
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);

			if (tab[i].afficherType().equals("Debit")) {
				soldeGlobal -= tab[i].getMontant();
			} else {
				soldeGlobal += tab[i].getMontant();
			}
		}
		System.out.println(soldeGlobal);
	}
}
