package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class lectureFichier {
	
    public List<Ville> Lirefichier() throws IOException {
    	File file = new File("C:/temp/recensement population 2016.csv");
    	List<String> lignes = FileUtils.readLines(file, "UTF-8");
        
    	List<Ville> villes = new ArrayList<>();
    	

    	for (int i = 1; i < lignes.size(); i++) {
    		//System.out.println(lignes.get(i));
    		String ligne = lignes.get(i);

    		// On commence par découper la ligne en morceaux sur la base du caractère séparateur « ; » . 
    		//De plus on ne récupère que les morceaux qui nous intéressent. 
    		//En l’occurrence on ignore les morceaux 3 et 4 dont on a pas besoin dans le TP
    		String[] morceaux = ligne.split(";");
    		String codeRegion = morceaux[0];
    		String nomRegion = morceaux[1];
    		String codeDepartement = morceaux[2];
    		String codeCommune = morceaux[5];
    		String nomCommune = morceaux[6];
    		String population = morceaux[7];

    		
    		// Pour la population, avant la conversion en double, il faut d’abord supprimer les
    		// // espaces qui se trouvent à l’intérieur. 
    		
    		double populationTotale = Double.parseDouble(population.replace(" ", ""));
    		
    		// Conversion des attributs String en double
    		double codeRegionD = Double.parseDouble(codeRegion);
    		double codeCommuneD = Double.parseDouble(codeCommune);
    		
    		villes.add(new Ville(codeRegionD, nomRegion, codeDepartement, codeCommuneD, nomCommune, populationTotale));
    		
    		
    		//System.out.println(Arrays.toString(morceaux) + " " + populationTotale);
    }
		return villes;
    	
    }
	

}
