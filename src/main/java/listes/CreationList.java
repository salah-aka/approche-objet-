package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationList {

	public static void main(String[] args) {
		List<Integer> valeurs;                             // déclaration
		valeurs = new ArrayList<Integer>();                // instanciation
		
		for(int i=0; i<100; i++) {
		valeurs.add (i);
	}
		System.out.println(valeurs.size());

	}
}
