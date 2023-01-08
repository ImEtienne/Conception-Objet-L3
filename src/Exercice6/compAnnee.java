package Exercice6;

import java.util.Comparator;

import Exercice2.Individu;

public class compAnnee implements Comparator<Individu>{
 
	@Override
	public int compare(Individu individu1, Individu individu2) {
		// TODO Auto-generated method stub
		
		return individu2.getAnneeNaissance() - individu1.getAnneeNaissance();
	}	
}
