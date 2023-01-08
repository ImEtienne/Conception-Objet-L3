package Exercice6;

import java.util.Comparator;

import Exercice2.Individu;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individu individu1 = new Individu("Shyam", 1997);
		Individu individu2 = new Individu("Mohammad", 1994);
		Individu individu3 = new Individu("Obed", 2000);
		Individu individu4 = new Individu("Mohammad", 1970);
		Individu [] tab = new Individu[]{individu1, individu2,individu3, individu4};
		
//		compAnnee compannee = new compAnnee();
//		System.out.println("La diff. between l'année the birth : "+compannee.compare(individu1, individu2));
//		
//		compLong complongName = new compLong();
//		System.out.println("La diff. de la longueur du name : " + complongName.compare(individu1, individu2));
		
		Comparator<Individu> c = null;
	
		System.out.println(Utils.max(c, tab));
	}

}
