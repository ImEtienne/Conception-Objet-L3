package Exercice2;
/**
 * 
 * @author etienne
 * version 08/09/2022
 *
 */

public class Individu {
	/**
	 * Les attributs de la classe
	 */
	private String nom;
	private int anneeNaissance;

	
	/**
	 * 
	 * @param nom
	 * @param adresse
	 * @param nbrAbonnes
	 */
	public Individu(String nom, int anneeNaissance) {
		super();
		this.nom = nom;
		this.anneeNaissance= anneeNaissance;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getNom() {
		return nom;
	}


	public int getAnneeNaissance() {
		return anneeNaissance;
	}


	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}


	@Override
	public String toString() {
		return this.nom + " " + this.anneeNaissance;
		
	}
}
