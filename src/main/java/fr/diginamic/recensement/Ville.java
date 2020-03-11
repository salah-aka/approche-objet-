package fr.diginamic.recensement;

import java.util.List;

public class Ville {
	private double codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private double codeCommune;
	private String nomCommune;
	private double populationTotale;

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

	public double getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(double codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public double getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(double codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public double getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(double populationTotale) {
		this.populationTotale = populationTotale;
	}

	public static void printListFromStart(List<Ville> list, int indice) {

		for (int i = 0; i < indice; i++) {

			System.out.println(list.get(i) + "\n");

		}

	}

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


}
