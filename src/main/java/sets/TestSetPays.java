package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetPays {

	public static void main(String[] args) {
		Set<Pays> setPays = new HashSet<>();
		setPays.addAll(Arrays.asList(new Pays("USA", 328_239_523, 62606), new Pays("France", 69_861_344, 43551),
				new Pays("Allemagne", 82_801_531, 50206), new Pays("UK", 63_421_628, 43620),
				new Pays("Italie", 61_302_519, 37970), new Pays("Japon", 124_856_424, 42659),
				new Pays("Chine", 1_408_089_559, 16624), new Pays("Russie", 126_434_660, 27900),
				new Pays("Inde", 1_386_249_417, 5174)));

		// le pays avec un PIB/habitant le plus important
		Iterator<Pays> iterator = setPays.iterator();

		Pays paysPibMax = iterator.next();
		while (iterator.hasNext()) {
			Pays paysCourant = iterator.next();

			if (paysCourant.getPibHabitant() > paysPibMax.getPibHabitant()) {
				paysPibMax = paysCourant;
			}
		}
		System.out.println("le pays avec un PIB/habitant le plus important --> " + paysPibMax);

		System.out.println("-----------------");

		// Le pays avec le PIB total le plus important

		iterator = setPays.iterator();

		Pays paysPibTotalMax = iterator.next();
		while (iterator.hasNext()) {
			Pays paysCourant = iterator.next();
			if (paysCourant.getPibTotal() > paysPibTotalMax.getPibTotal()) {
				paysPibTotalMax = paysCourant;
			}
		}
		System.out.println("Le pays avec un PIB total le plus important --> " + paysPibTotalMax);

		System.out.println("-------------");

		// Modifiez le contenu du HashSet pour mettre en majuscules le pays qui a le PIB
		// total le plus petit
		iterator = setPays.iterator();

		Pays paysPibTotalMin = iterator.next();
		while (iterator.hasNext()) {
			Pays paysCourant = iterator.next();
			if (paysCourant.getPibTotal() < paysPibTotalMin.getPibTotal()) {
				paysPibTotalMin = paysCourant;
			}
		}
		paysPibTotalMin.setNom(paysPibTotalMin.getNom().toUpperCase());

		System.out.println(paysPibTotalMin);
		System.out.println("-----------");

		// Supprimez le pays avec le PIB total le plus petit et affichage du reste des
		// pays avec leurs PIB total
		setPays.remove(paysPibTotalMin);

		iterator = setPays.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
