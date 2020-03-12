package fr.diginamic.testenumeration;

/**
 * Represente une enumeration avec un libelle et un num d'ordre
 * 
 * @author Salaheddine El Majddoub
 *
 */
public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Ete", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int numOrdre;

	/**
	 * constructeur
	 * 
	 * @param libelle
	 * @param numOrdre
	 */
	private Saison(String libelle, int numOrdre) {
		this.libelle = libelle;
		this.numOrdre = numOrdre;

	}

	/**Methode permet d'avoir le Saison en utilisant un variable (libelle) de type String
	 * @param lib
	 * @return la saison
	 */
	public static Saison getInstance(String lib) {
		for (Saison saison : Saison.values()) {
    		if (saison.getLibelle().equals(lib)) {
    			return saison;
    		}	
    	}
		return null;
	}

	/**
	 * Getter
	 * 
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return numero d'ordre
	 */
	public int getNumOrdre() {
		return numOrdre;
	}

	/**
	 * Setter
	 * 
	 * @param numOrdre
	 */
	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

	
}
