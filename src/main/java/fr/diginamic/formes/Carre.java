package fr.diginamic.formes;

public class Carre extends Rectangle {
	int cote;
	public Carre(int cote) {
		super(cote, cote);
	}

	public double CalculPerimetre() {
	
		return 4*longueur ;
	}

	public double CalculSurface() {
		return longueur * longueur;
	}

public String toString() {
	return "La surface du carr� est " + this.CalculPerimetre() + ". Le perimetre du carr� est " + this.CalculSurface();
	}
}