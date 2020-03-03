package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale a1 = new AdressePostale (5, "chemin du bassin", 92000, "Paris");
		Personne p1 = new Personne ("EL MAJDOUB", "Salaheddine", a1);
		
		AdressePostale a2 = new AdressePostale (5, "chemin du bassin", 92000, "Paris");
	    Personne p2 = new Personne (" majdoub", "Salah", a2);
    
	   p1.AfficherIdentite();
       p2.AfficherIdentite();
       
       p1.setNom("el majdoub");
       p1.setPrenom("salaheddine");
       p1.setAdresse(a1);
       
       String n1=p1.getNom();
       System.out.println(n1);
       

	}
	
	
	}

