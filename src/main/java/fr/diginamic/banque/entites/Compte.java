package fr.diginamic.banque.entites;

/**
 * @Numero de compte 
 * solde de compte 
 *
 */
public class Compte {

   String numeroCompte;
   int soldeCompte;
    
   public Compte(String a, int b) {
   this.numeroCompte = a;
   this.soldeCompte =b;
   }
   
   @Override
public String toString() {
		return " Le numéro de compte est " + numeroCompte + " et le solde de compte est  " + soldeCompte;
	}
  
}


