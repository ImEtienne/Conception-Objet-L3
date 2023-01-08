package Exercice5;
/**
 * 
 * @author etienne
 * Tuesday 04/10/2022
 */

public abstract class Forme5 {
	abstract double surface(double x);
	private String etiquette;
	
	public Forme5(String etiquette) {
		this.etiquette = etiquette;
	}

	public String getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}
	
}
