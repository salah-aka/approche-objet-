package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> setPays = new HashSet<String>();
		setPays.add("USA");
		setPays.add("France");
		setPays.add("Allemagne");
		setPays.add("UK");
		setPays.add("Italie");
		setPays.add("Japon");
		setPays.add("Chine");
		setPays.add("Russie");
		setPays.add("Inde");
		
		// Affichage de la pays parmis la collection avec le max de nbres de lettres

		Iterator<String> iterator = setPays.iterator();
		
		int nbMaxLettres = 0;
		String paysMaxLettres = null;
		while (iterator.hasNext()) {
			String pays = iterator.next();
			System.out.print(pays + "/");
			if (pays.length() > nbMaxLettres) {
				nbMaxLettres = pays.length();
				paysMaxLettres = pays;
			}
		}
		System.out.println( " ");

		System.out.println(" Le pays avec max de lettres c'est " + paysMaxLettres + " : " + nbMaxLettres);
	
		
		// Affichage de la collection des pays sans celui avec max des lettres
		setPays.remove(paysMaxLettres);
		System.out.println(" La collection des pays sans celui avec max des lettres " + setPays);
		
	
	}
	

}
