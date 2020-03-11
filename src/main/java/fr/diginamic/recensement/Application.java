package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Map;

public class Application {

	public static void main(String[] args) throws IOException {

		lectureFichier lire = new lectureFichier();
		List<Ville> ville = lire.Lirefichier();
		Ville pettiteHerault = null;
		double popHerault = 0;
		ArrayList<Ville> villesHerault = new ArrayList<Ville>();

		// la liste la ville de Montpellier et affichez toutes les informations la concernant 

		for (Ville v : ville) {
			if (v.getNomCommune().equals("Montpellier")) {
				System.out.println(v);
			}
		}

		// Calcule et affiche la population totale de l'Hérault et affiche la plus
		// petite ville du département

		
		for (Ville v : ville) {

			if (v.getCodeDepartement().equals("34")) {

				popHerault += v.getPopulationTotale();

				if (pettiteHerault == null || pettiteHerault.getPopulationTotale() > v.getPopulationTotale()) {

					pettiteHerault = v;
				}
			}
		}

		System.out.println("\nPopulation totale de l'hérault : " + popHerault);

		System.out.println("\nPlus petite ville du département de l'Hérault : \n" + pettiteHerault);

		//Affiche les 10 plus grandes villes de l'Hérault
		//Affiche les 10 plus petites villes de l'Hérault

		for (Ville v : ville) {

			if (v.getCodeDepartement().equals("34")) {

				villesHerault.add(v);

			}

		}

		Collections.sort(villesHerault<lire>);
		System.out.println("\nLes 10 plus grande ville de l'Hérault sont : ");

		Ville.printListFromEnd(villesHerault, 10);
	}
}
