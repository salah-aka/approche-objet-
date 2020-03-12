package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestTri {

	public static void main(String[] args) {
		List<Pays> listNommodifiable = Arrays.asList(new Pays("USA", 328_239_523, 62606), new Pays("France", 69_861_344, 43551),
				new Pays("Allemagne", 82_801_531, 50206), new Pays("UK", 63_421_628, 43620),
				new Pays("Italie", 61_302_519, 37970), new Pays("Japon", 124_856_424, 42659),
				new Pays("Chine", 1_408_089_559, 16624), new Pays("Russie", 126_434_660, 27900),
				new Pays("Inde", 1_386_249_417, 5174));
				
		List<Pays> listPays = new ArrayList<Pays>(listNommodifiable);
		// EXO1
		// Affichage et tri de la liste
		Iterator<Pays> itsetPays = listPays.iterator();
		while (itsetPays.hasNext()) {
			Pays courant = itsetPays.next();
			System.out.println(courant);
		}
		System.out.println("---------------");
	
		Collections.sort(listPays);
		
		for (Pays pays : listPays) {
			System.out.println(pays);
		}
		
		// EXO2
		// Affichage et tri de la liste par order decroissant de PIB/habitant
		System.out.println("---------------");
		Collections.sort(listPays);
		for (Pays pays : listPays) {
			System.out.println(pays);
		}
		
		//EXO3 
		//Triage des selon le nombre d'habitant à l'aide de la classe ComparatorHabitant
		System.out.println("---------------");
		Collections.sort(listPays , new ComparatorHabitant());
		for (Pays pays : listPays) {
			System.out.println(pays);
		}
		
		//Triage des selon le nombre d'habitant à l'aide de la classe ComparatorHabitant
		System.out.println("---------------");
		Collections.sort(listPays , new ComparatorPibHabitant());
		for (Pays pays : listPays) {
			System.out.println(pays);
		}
	}

}
