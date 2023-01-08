package Exercice4;

public class Carre {
	private double longueurCote;
	
	public Carre(double longueurCote ) {
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
		return "je suis un carré avec un côté de longueur" + " " + this.longueurCote + " " + "et de surface" +" " + surface(longueurCote);
	}

}
