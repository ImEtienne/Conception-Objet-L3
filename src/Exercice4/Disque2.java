package Exercice4;

public class Disque2 implements Forme{
	private double rayon;
	
	public Disque2(double rayon) {
		this.rayon = rayon;
	}
	
	public double surface(double rayon) {
		return (Math.PI) * (rayon*rayon) ;
	}
	
	@Override
	public String toString() {
		return "je suis un disque de rayon" + " " + this.rayon + " " + "et de surface" +  " " + surface(rayon);
	}
}
