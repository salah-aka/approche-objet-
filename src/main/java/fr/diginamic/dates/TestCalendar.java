package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		// créez une instance de Date à la date de jour et affichez la format "jour/mois/anné"
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 14);
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.YEAR, 2020);
		Date date = calendar.getTime();

		SimpleDateFormat formatage = new SimpleDateFormat("dd/MM/yyyy ");
		
		String dateFormate = formatage.format( date);
		System.out.println("La date du jour est :" + dateFormate);
		
		//créez une instance de Date à la date de jour et 
		//à cette heure exact :23h30 et 59 secondes.
		System.out.println("---------------");

		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(Calendar.YEAR, 2020);
		calendar1.set(Calendar.MONTH, 2);
		calendar1.set(Calendar.DAY_OF_MONTH, 14);
		calendar1.set(Calendar.HOUR_OF_DAY, 23);
		calendar1.set(Calendar.MINUTE, 30);
		calendar1.set(Calendar.SECOND, 59);
		Date date1 = calendar1.getTime();

		SimpleDateFormat formatage1 = new SimpleDateFormat("yyyy/MM/dd à HH'h' mm:ss");

		String dateFormate1 = formatage1.format(date1);
		System.out.println("La date du jour et à cette heure exact (23h30min et 59s): " + dateFormate1);
		
		//Affichage en format "jj-mm-aaaa hh:mm:ss"
		System.out.println("---------------");

		SimpleDateFormat formatage2 = new SimpleDateFormat("dd-MM-yyyy à HH':'mm:ss");
		String dateFormate2 = formatage2.format(date1);

		System.out.println("La date sous forme (jj-mm-aaaa hh:mm:ss): " + dateFormate2);


	}

}
