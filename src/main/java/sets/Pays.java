package sets;


public class Pays {
	/** nom */
	private String nom;
	/** nbHabitants */
	private int nbHabitants;
	/** pibHabitant */
	private int pibHabitant;
	
	/**constructeur
	 * @param nom
	 * @param nbHabitants
	 * @param pibHabitant
	 */
	public Pays(String nom, int nbHabitants, int pibHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitant = pibHabitant;
	}
	
	/**Methode de calcul de la PIB total d'un pays
	 * @return
	 */
	public long getPibTotal() {
		return (long) nbHabitants * (long) pibHabitant;
	}
	
	@Override
	public String toString() {
		
		return  nom + " - nbHabitants: " + nbHabitants  + " - PIB par habitant :"
					+ pibHabitant+" $" + " - PIB total " + getPibTotal()+" $";
		}

	/**Getter
	 * @return nom d'habitant
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 * @param nom  d'habitant
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter
	 * @return nbre d'habitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**Setter
	 * @param nbHabitants
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**Getter
	 * @return PIB/Habitant
	 */
	public int getPibHabitant() {
		return pibHabitant;
	}

	/**Setter
	 * @param pibHabitant
	 */
	public void setPibHabitant(int pibHabitant) {
		this.pibHabitant = pibHabitant;
	}
	
}
