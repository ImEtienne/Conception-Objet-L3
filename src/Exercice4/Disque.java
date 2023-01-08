package Exercice4;
import java.lang.Math;

public class Disque {
	private double rayon;
	
	public Disque(double rayon) {
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
