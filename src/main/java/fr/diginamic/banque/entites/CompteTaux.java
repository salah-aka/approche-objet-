package fr.diginamic.banque.entites;

/** Réprésente 
 * @author Salaheddine el majdoub
 *
 */
public class CompteTaux extends Compte {
	
	/** tauxRemu */
	private int tauxRemu;
	
/**constructeur
 * @param numeroCompte
 * @param soldeCompte
 * @param tauxRemu
 */
public CompteTaux(String numeroCompte, int soldeCompte, int tauxRemu) {	
	super(numeroCompte, soldeCompte);
	this.tauxRemu = tauxRemu;
     }

@Override
public String toString() {
	super.toString();
	return " Le numéro de compte est " + numeroCompte + " et le solde de compte est  " + soldeCompte + "\n" + " La taux de rémuniration est " + tauxRemu;
      }

/**
 * @return
 */
public int getTauxRemu() {
	return tauxRemu;
}

/**
 * @param tauxRemu
 */
public void setTauxRemu(int tauxRemu) {
	this.tauxRemu = tauxRemu;
}
}



