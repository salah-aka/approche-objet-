package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
	return o1.getNbHabitants() - o2.getNbHabitants();
	}

}
