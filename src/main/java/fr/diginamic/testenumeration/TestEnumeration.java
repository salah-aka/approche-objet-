package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		// La boucle pour affichez toutes les saisons contenues dans l’énumération
		for (Saison saison : Saison.values()) {
			System.out.print(saison + "/");
		}
		System.out.println(" ");

		// méthode de base des énumérations pour
		// retrouver et afficher l’énumération dont le nom est ETE
		String nom = "ETE";
		System.out.println(Saison.valueOf(nom));

		// vérification que c’est bien HIVER qui est
		// retournée lorsque vous la tester avec la variable libelle
		String libelle = "Hiver";
		System.out.println(Saison.getInstance(libelle));

	}
}
