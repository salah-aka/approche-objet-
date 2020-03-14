package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		  // EXO1
	//Affichage de date d'aujourd'hui avec une instance jour/mois/année 
		
     SimpleDateFormat formatage = new SimpleDateFormat("dd/MM/yyyy");;
	 Date date = new Date(120, 02, 14);
	System.out.println("Le date d'aujourd'hui est : " + formatage.format(date));
	
	//Affichage de date d'aujourd'hui avec une instance année/mois/jours et une heure exacte
	System.out.println("---------------");
	Date date1 = new Date(120, 02, 14, 23, 30, 59);
	SimpleDateFormat formatage1 = new SimpleDateFormat("yyyy/MM/dd à HH'h' mm:ss");
	System.out.println(formatage1.format(date1));
	
	//Affichage de de l'heure avec une instance de Date contenant la date/heure système 
	System.out.println("---------------");
	SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy HH'h'");
	System.out.println(formattage.format(date1));
	
	          // EXO1

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}


