package fr.diginamic.banque.entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {
	
	    public static void main(String[] args) {
	    CercleFactory cf = new CercleFactory();
	    System.out.println("Le surface de la cercle est " + cf.Surface(12));
	    System.out.println("Le surface de la cercle est " + cf.Surface(10)); 
	    System.out.println("Le surface de la cercle est " + cf.Surface(14));

	    }
}
