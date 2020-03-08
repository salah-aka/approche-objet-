package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon;

	public Cercle(double rayon) {
		this.rayon= rayon;
	}
	public double CalculPerimetre() {
		return 2 * Math.PI * rayon;
	}
	public double CalculSurface() {
		return  Math.PI * rayon * rayon;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public String toString() {
		return "La surface du cercle est " + this.CalculPerimetre() + ". Le perimetre du cercle est " + this.CalculSurface();
		}
	}	
