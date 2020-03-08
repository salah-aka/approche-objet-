package fr.diginamic.formes;

import fr.diginamic.essais.AffichageForme;
import fr.diginamic.formes.Forme;

//import fr.diginamic.formes.Carre;
//import fr.diginamic.formes.Cercle;
//import fr.diginamic.formes.Rectangle;
public class TestFormes extends Forme {

	public static void main(String[] args) {

	Rectangle r = new Rectangle (2,3);
	Cercle c = new Cercle(3);
	Carre ca = new Carre(4);
			System.out.println(r.CalculSurface());
			System.out.println(r.CalculPerimetre());
			
			System.out.println(c.CalculSurface());
			System.out.println(c.CalculPerimetre());
			System.out.println(ca.CalculPerimetre());
			System.out.println(ca.CalculSurface());
		
			
			AffichageForme.afficher(c);
			AffichageForme.afficher(ca);
			AffichageForme.afficher(r);
			

	}

	@Override
	public double CalculPerimetre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double CalculSurface() {
		// TODO Auto-generated method stub
		return 0;
	}

}
