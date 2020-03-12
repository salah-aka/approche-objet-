package tri;

import java.text.DecimalFormat;

public class Pays implements Comparable<Pays> {
	/** nom */
	private String nom;
	/** nbHabitants */
	private int nbHabitants;
	/** pibHabitant */
	private int pibHabitant;

	/**
	 * constructeur
	 * 
	 * @param nom
	 * @param nbHabitants
	 * @param
	 */
	public Pays(String nom, int nbHabitants, int pibHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitant = pibHabitant;
	}

	@Override
	public int compareTo(Pays pays2) {
		// return this.nom.compareTo(pays2.getNom());
		return pibHabitant - pays2.getPibHabitant();
	}

	/**
	 * Methode de calcul de la PIB total d'un pays
	 * 
	 * @return
	 */
	public long getPibTotal() {
		return (long) nbHabitants * (long) pibHabitant;
	}

	@Override
	// Redifinition de la méthode equals
	public boolean equals(Object object) {
		if (!(object instanceof Pays)) {
			return false;
		}
		Pays other = (Pays) object;
		return nom.equals(other.getNom());
	}

	@Override
	public String toString() {
		return nom + " - nbHabitants: " + nbHabitants + " - PIB par habitant :" + pibHabitant + " $" + " - PIB total "
				+ getPibTotal() + " $";
	}

	/**
	 * Getter
	 * 
	 * @return nom d'habitant
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom d'habitant
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return nbre d'habitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitants
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return PIB/Habitant
	 */
	public int getPibHabitant() {
		return pibHabitant;
	}

	/**
	 * Setter
	 * 
	 * @param pibHabitant
	 */
	public void setPibHabitant(int pibHabitant) {
		this.pibHabitant = pibHabitant;
	}

}
