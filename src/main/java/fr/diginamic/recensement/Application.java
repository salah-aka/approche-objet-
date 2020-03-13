package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;

public class Application {

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}

	public static void main(String[] args) throws IOException {

		List<Ville> villes = new ArrayList<>();
		List<Ville> villesHerault = new ArrayList<>();
		List<Ville> villesOccitanie = new ArrayList<>();

		Ville pettiteHerault = null;
		double popOccitanie = 0;
		double popHerault = 0;

		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			for (int i = 1; i < lignes.size(); i++) {
				// System.out.println(lignes.get(i));
				String ligne = lignes.get(i);

				// On commence par d�couper la ligne en morceaux sur la base du caract�re
				// s�parateur � ; � .
				// De plus on ne r�cup�re que les morceaux qui nous int�ressent.
				// En l�occurrence on ignore les morceaux 3 et 4 dont on a pas besoin dans le TP
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];

				// Pour la population, avant la conversion en double, il faut d�abord supprimer
				// les  espaces qui se trouvent � l�int�rieur.

				double populationTotale = Double.parseDouble(population.replace(" ", ""));

				// Conversion des attributs String en double
				double codeRegionD = Double.parseDouble(codeRegion);
				double codeCommuneD = Double.parseDouble(codeCommune);

				villes.add(new Ville(codeRegionD, nomRegion, codeDepartement, codeCommuneD, nomCommune, populationTotale));

				// System.out.println(Arrays.toString(morceaux) + " " + populationTotale);
			}

			// la liste a ville de Montpellier et affichez toutes ses informations

			for (Ville v : villes) {
				if (v.getNomCommune().equals("Montpellier")) {
					System.out.println(v);
				}
			}

			// Calcule et affiche la population totale de l'H�rault et affiche la plus
			// petite ville du d�partement
			System.out.println("---------------");
			for (Ville v : villes) {

				if (v.getCodeDepartement().equals("34")) {

					popHerault += v.getPopulationTotale();

					if (pettiteHerault == null || pettiteHerault.getPopulationTotale() > v.getPopulationTotale()) {

						pettiteHerault = v;
					}
				}
			}
			System.out.println("\nPlus petite ville du d�partement de l'H�rault : \n" + pettiteHerault);
			System.out.println("\nPopulation totale de l'h�rault : " + popHerault);

			// Affiche les 10 plus grandes villes de l'H�rault
			// Affiche les 10 plus petites villes de l'H�rault
			System.out.println("---------------");
			for (Ville v : villes) {
				if (v.getCodeDepartement().equals("34")) {
					villesHerault.add(v);
				}
			}

			Collections.<Ville>sort(villesHerault);
			System.out.println("\n les 10 plus grandes villes de l'H�rault sont :");
			Ville.printListFromEnd(villesHerault, 10);

			System.out.println("\nLes 10 plus petite ville de l'H�rault sont : ");
			Ville.printListFromStart(villesHerault, 10);

			// Affichez la population de toute la r�gion Occitanie

			System.out.println("---------------");
			for (Ville v : villes) {
				if (v.getCodeDepartement().equals("76")) {
					popOccitanie += v.getPopulationTotale();
				}
			}
			System.out.println("Population totale de l'Occitanie : " + popOccitanie);

			// Affichez les 10 villes les plus importantes de la r�gion Occitanie
			System.out.println("---------------");

			for (Ville v : villes) {
				if (v.getNomRegion().equals("Occitanie")) {

					villesOccitanie.add(v);
				}
			}
			Collections.<Ville>sort(villesOccitanie);
			System.out.println("Les 10 plus grande ville de la r�gion Occitanie  : ");
			Ville.printListFromEnd(villesOccitanie, 10);

			// Affichez le d�partement le plus peupl� de la r�gion Occitanie
			System.out.println("---------------");

			HashMap<String, Double> regOccitanie = new HashMap<>();
			for (Ville v : villes) {
				if (v.getNomRegion().equals("Occitanie")) {

					String codeDep = v.getCodeDepartement();
					double pop = v.getPopulationTotale();

					if (regOccitanie.get(codeDep) == null) {
						regOccitanie.put(codeDep, pop);
					} else {
						regOccitanie.put(codeDep, regOccitanie.get(codeDep) + pop);
					}
				}
			}
			List<Double> listeOccitanie = new ArrayList<>(regOccitanie.values());
			Collections.sort(listeOccitanie);
			String key = getKey(regOccitanie, listeOccitanie.get(listeOccitanie.size() - 1));
			System.out.println("Dans la r�gion Occitanie, le departement le plus peubl�  est : " + key
					+ " avec une population totale de " + listeOccitanie.get(listeOccitanie.size() - 1));

			// Affichez les 10 r�gions les plus peupl�s de France
			System.out.println("---------------");

			HashMap<String, Integer> regFrance = new HashMap<>();
			for (Ville v : villes) {

				String region = v.getNomRegion();
				int pop = (int) v.getPopulationTotale();

				if (regFrance.get(region) == null) {

					regFrance.put(region, pop);
				} else {
					regFrance.put(region, regFrance.get(region) + pop);
				}
			}
			List<Integer> listeRegion = new ArrayList<>(regFrance.values());
			Collections.sort(listeRegion);
			System.out.println("Les 10 r�gions les plus peupl�s de France sont : ");
			for (int i = listeRegion.size() - 1; i >= listeRegion.size() - 10; i--) {

				System.out.println(getKey(regFrance, listeRegion.get(i)));
			}

			// Affiche les 10 d�partements les plus peupl�s de France
			System.out.println("---------------");

			HashMap<String, Integer> depFrance = new HashMap<>();
			for (Ville v : villes) {
				String dep = v.getCodeDepartement();
				int pop = (int) v.getPopulationTotale();
				
				if (depFrance.get(dep) == null) {
					depFrance.put(dep, pop);
				} else {
					depFrance.put(dep, depFrance.get(dep) + pop);
				}
			}
			List<Integer> listDep = new ArrayList<>(depFrance.values());
			Collections.sort(listDep);
			System.out.println("Les 10 d�partements les plus peupl�s de la France sont : ");
			for (int i = listDep.size() - 1; i >= listDep.size() - 10; i--) {
				System.out.println(getKey(depFrance, listDep.get(i)));
			}

			// Affichez les 10 villes les plus peupl�s de France

			System.out.println("---------------");

			Collections.<Ville>sort(villes);
			System.out.println("\nLes 10 villes les plus peupl� de France sont : ");
			Ville.printListFromEnd(villes, 10);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
