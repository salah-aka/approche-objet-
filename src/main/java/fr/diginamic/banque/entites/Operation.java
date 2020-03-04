package fr.diginamic.banque.entites;

/**Operation d'un compte bancaire
 * @salaheddine El Majdoub
 *
 */
    public abstract class Operation {
	
	protected String date;
	protected double montant;

	/**constructeur
	 * @param date
	 * @param montant
	 */
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}
	public abstract String afficherType();
	
	public String toString() {
		return afficherType() + " - " + date + " " + montant;
	}
	
	
	/**Getter
	 * @return date
	 */
	public String getDate() {
		return date;
	}
	/**Setter
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**Getter
	 * @return montant
	 */
	public double getMontant() {
		return montant;
	}
	/**Setter
	 * @param montant
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	


}
