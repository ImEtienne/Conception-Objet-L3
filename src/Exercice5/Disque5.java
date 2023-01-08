package Exercice5;
/**
 * 
 * @author etienne
 *  Tuesday 04/10/22
 */

public class Disque5 extends Forme5{
	private double rayon;
	
	
	public Disque5(double rayon, String etiquette) {
		super(etiquette);
		this.rayon = rayon;
	}
	

	public double surface(double rayon) {
		return (rayon*rayon) * (Math.PI) ;
	}
	
	@Override
	public String toString() {
		return super.getEtiquette() + " : " + "je suis un disque de rayon" + " " + this.rayon + " " + "et de surface" +  " " + surface(rayon);
	}

}
