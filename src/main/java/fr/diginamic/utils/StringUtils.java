package fr.diginamic.utils;

public final class StringUtils {

	/**Repr�sente la distance de levenshtein entre deux chaines de caract�re
	 * @param lhs
	 * @param rhs
	 * @return
	 * @throws IncorrectParametreException
	 */
	public static int levenshteinDistance(CharSequence lhs, CharSequence rhs) throws IncorrectParametreException   {
		
		if(lhs==null || rhs==null) {
			throw new IncorrectParametreException("la valeur de levenshteinDistance ne peut avoir une des deux valeurs nulles ");
		}
		
		int len0 = lhs.length() + 1;
		int len1 = rhs.length() + 1;
		int[] cost = new int[len0];
		int[] newcost = new int[len0];
		for (int i = 0; i < len0; i++) {
			cost[i] = i;
		}
		for (int j = 1; j < len1; j++) {
			newcost[0] = j;
			for (int i = 1; i < len0; i++) {
				int match = (lhs.charAt(i - 1) == rhs.charAt(j - 1)) ? 0 : 1;
				//System.out.println(match);
				int costReplace = cost[i - 1] + match;
				int costInsert = cost[i] + 1;
				int costDelete = newcost[i - 1] + 1;
				newcost[i] = Math.min(Math.min(costInsert, costDelete), costReplace);
			     }
				int[] swap = cost;
				cost = newcost;
				newcost = swap;
			}
			return cost[len0 - 1];
		}	
}
	

