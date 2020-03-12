package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		// La boucle pour affichez toutes les saisons contenues dans l��num�ration
		for (Saison saison : Saison.values()) {
			System.out.print(saison + "/");
		}
		System.out.println(" ");

		// m�thode de base des �num�rations pour
		// retrouver et afficher l��num�ration dont le nom est ETE
		String nom = "ETE";
		System.out.println(Saison.valueOf(nom));

		// v�rification que c�est bien HIVER qui est
		// retourn�e lorsque vous la tester avec la variable libelle
		String libelle = "Hiver";
		System.out.println(Saison.getInstance(libelle));

	}
}
