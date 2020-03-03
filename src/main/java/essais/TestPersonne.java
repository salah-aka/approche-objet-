package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		 AdressePostale a = new AdressePostale ();
		 a.numeroRue = 5;
		 a.libelleRue = "chemin du bassin";
		 a.codePostale= 92000;
         a.ville = "Paris";
         
         Personne p = new Personne();
         p.nom = "EL MAJDOUB";
         p.prenom = "Salaheddine";
         p.adresse = a;

	}

}
