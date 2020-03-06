package fr.diginamic.chaines;

public class ManipulationChaine {

	
	/**Methode main
	 * @param args
	 */
	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		/*char premierCaractere = chaine.charAt(0);
		System.out.println("Le premier caractère est : " + premierCaractere);
		
		int tailleChaine = chaine.length();
		System.out.println("La taille de la chaine de caractères est : " + tailleChaine);
		
        int num = chaine.indexOf( ";");
		System.out.println("l'indexe de premier caractère ';' dans la chaine est : " + num);
		
		 int num1 = chaine.indexOf( "D");
		 int num2 = chaine.indexOf( ";");
        String nom = chaine.substring(num1, num2);
		System.out.println("le nom de famille est : " + nom);

		String NOM = nom.toUpperCase();
		System.out.println("le nom de famille en majuscule est : " + NOM);
		
		String nom1 = nom.toLowerCase();
		System.out.println("le nom de famille en minuscule est : " + nom1);*/
		
		String[] tab = chaine.split(";");
		for (int i=0; i<tab.length; i++) 
		System.out.print(tab[i]+ "/");
		
		
		System.out.println("\n Nom de client : " + tab[0] +" "+ tab[1]);
        String compte = tab[3].replace(' ', '_');
		System.out.println(" Compte : " + tab[2] + " / " +  compte );

	}

	}
	


