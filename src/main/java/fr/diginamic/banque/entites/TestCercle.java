package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle[] cercles = new Cercle[2];
		cercles[0] = new Cercle(12);
		cercles[1] = new Cercle(10);
		
	 for (int i=0; i<cercles.length; i++)
		System.out.println(cercles[i]);
		}
	}



