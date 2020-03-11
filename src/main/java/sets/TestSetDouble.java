package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<Double>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add( 48.5);
		set.add( 0.01 );
		
		// L'affichage des �lements de la collection
		System.out.println(set);
		
		// L'affichage de l'�lement le plus elev�
		System.out.println(Collections.max(set));


		// L'affichage de liste sans l'�lement le plus elev�
		set.remove(Collections.min(set));
		System.out.println(set);

	}

}
