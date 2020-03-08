package fr.diginamic.formes;

public class Rectangle extends Forme {
	protected double longueur;
	protected double largeur;
	public Rectangle(double longueur, double largeur ) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double CalculPerimetre() {
		return 2 * (longueur + largeur);
	}

	public double CalculSurface() {
		return longueur * largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	public String toString() {
		return "La surface du rectangle est " + this.CalculPerimetre() + ". Le perimetre du rectangle est " + this.CalculSurface();
		}
}
