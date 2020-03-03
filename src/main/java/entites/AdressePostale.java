package entites;

/**
 *Représente le concept d'adresse postable 
 *
 */
public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostale;
	String ville;
	public AdressePostale (int n, String l, int c, String v) {
	    this.libelleRue = l;
	    this.numeroRue= n;
		this.codePostale = c;
		this.ville = v;
	}
	
	
}


