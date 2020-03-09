package Interface;

/**Represente un cercle
 * @author formation
 *
 */
public class Cercle implements ObjetGeometrique {
	/** rayon */
	private double rayon;

	/**constructeur
	 * @param rayon rayon du cercle
	 */
	public Cercle(double rayon) {
		this.rayon= rayon;
	}
	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}
	
	@Override
	public double surface() {
		return  Math.PI * rayon * rayon;
	} 

}
