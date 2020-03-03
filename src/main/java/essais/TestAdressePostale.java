package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		 AdressePostale a = new AdressePostale ();
		 a.numeroRue = 5;
		 a.libelleRue = "chemin du bassin";
		 a.codePostale= 92000;
         a.ville = "Paris";
         
         AdressePostale b = new AdressePostale ();
		 b.numeroRue = 15;
		 b.libelleRue = "voltaire";
		 b.codePostale= 13006;
         b.ville = "Marseille";
	}

}
