package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ville implements Comparable<Ville> {

	protected double codeRegion;
	protected String nomRegion;
	protected String codeDepartement;
	protected double codeCommune;
	protected String nomCommune;
	protected Double populationTotale;

	/**
	 * constructeur
	 * 
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotale
	 */
	public Ville(double codeRegion, String nomRegion, String codeDepartement, double codeCommune, String nomCommune,
			double populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}

//
//	public int compareTo(Ville v) {
//		return populationTotale.compareTo(v.getPopulationTotale());
//
//	}
//
	public int compareTo(Ville pers) {
		int result = this.populationTotale.compareTo(pers.getPopulationTotale());
		return result;
	}

	/**Methode d'affichage des 10  premiers élements de la liste  
	 * @param list
	 * @param indice
	 */
	public static void printListFromStart(List<Ville> list, int indice) {
		for (int i = 0; i < indice; i++) {
			System.out.println(list.get(i) + "\n");
		}
	}

	/**	/**Methode d'affichage des 10  derniers élements de la liste  

	 * @param list
	 * @param indice
	 */
	public static void printListFromEnd(List<Ville> list, int indice) {
		for (int i = list.size() - 1; i >= list.size() - indice; i--) {
			System.out.println(list.get(i) + "\n");
		}
	}

	@Override
	public String toString() {
		return nomCommune + " [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement="
				+ codeDepartement + ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune
				+ ", populationTotale=" + populationTotale + "]";
	}

	/**Getter
	 * @return code de region 
	 */
	public double getCodeRegion() {
		return codeRegion;
	}

	/**Setter
	 * @param codeRegion
	 */
	public void setCodeRegion(double codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**Getter
	 * @return numero de region
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**Setter
	 * @param nomRegion
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/**Getter
	 * @return Code de departement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**Setter
	 * @param codeDepartement
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**Getter
	 * @return Code de la commune
	 */
	public double getCodeCommune() {
		return codeCommune;
	}

	/**Setter
	 * @param codeCommune
	 */
	public void setCodeCommune(double codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**Getter
	 * @return nom de la commune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**Setter
	 * @param nomCommune
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**Getter
	 * @return Population totale
	 */
	public double getPopulationTotale() {
		return populationTotale;
	}

	/**Setter
	 * @param populationTotale
	 */
	public void setPopulationTotale(double populationTotale) {
		this.populationTotale = populationTotale;
	}

}
