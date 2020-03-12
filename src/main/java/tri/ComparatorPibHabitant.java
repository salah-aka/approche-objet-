package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
	return o2.getPibHabitant() - o1.getPibHabitant();
		}
}
