package Exercice5;
/**
 * 
 * @author etienne
 * Tuesday 04/10/2022
 *
 */

public class Carre5 extends Forme5{
	private double longueurCote;
	
	public Carre5(double longueurCote, String etiquette) {
		super(etiquette);
		this.longueurCote = longueurCote;
		
	}
	
	public double surface(double longueurCote) {
		return longueurCote * longueurCote;
	}
	
	
	public double getLongueurCote() {
		return longueurCote;
	}

	public void setLongueurCote(double longueurCote) {
		this.longueurCote = longueurCote;
	}
	
	@Override
	public String toString() {
		return super.getEtiquette() + " : " + "je suis un carré avec un côté de longueur" + " " + this.longueurCote + " " + "et de surface" +" " + surface(longueurCote);
	}

}
