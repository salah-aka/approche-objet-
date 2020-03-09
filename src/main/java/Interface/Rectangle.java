package Interface;

public class Rectangle implements ObjetGeometrique{
	
	/** longueur */
	protected double longueur;
	/** largeur */
	protected double largeur;
	
	
	/**constructeur
	 * @param longueur longueur du rectangle
	 * @param largeurlargeur du rectangle
	 */
	public Rectangle(double longueur, double largeur ) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
    @Override
	public double perimetre() {
		return 2 * (longueur + largeur);
	}
    
    @Override
	public double surface() {
		return longueur * largeur;
	}

}
