package fr.diginamic.banque.entites;

public class Cercle {

	private double rayon;

	/**
	 * constructeur
	 * 
	 * @param r : rayon du cercle
	 */
	public Cercle(double r) {
		this.rayon = r;
	}

	/**Méthode pour le calcul de perimetre 
	 * @return perimetre du cercle
	 */
	private double perimetre() {
		return 2 * Math.PI * rayon;
	}

	/**Méthode pour le calcul de surface 
	 * @return surface du cercle
	 */
	private double surface() {
		return Math.PI * rayon * rayon;
	}
	
	@Override
	public String toString() {
        return "le Surface de la cercle est [Surface = " + Math.PI * rayon * rayon + "]: avec un perimetre de " + perimetre();
    }

	/**
	 * Getter
	 * 
	 * @return rayon du cercle
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * Setter
	 * 
	 * @param rayon du cercle
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
