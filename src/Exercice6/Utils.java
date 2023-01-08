package Exercice6;

import java.util.Comparator;

import Exercice2.Individu;

public class Utils {
	
	public static Individu max(Comparator<Individu> c, Individu[] t) {
		Individu temp = null;
		compAnnee compareAnnee = new compAnnee();
		for(int i=0; i < t.length-1; i++) {
			if (compareAnnee.compare(t[i], t[i+1]) < 0) {
				temp = t[i+1];
			} else {
				if (compareAnnee.compare(temp, t[i+1]) > 0)
					temp = t[i];
			}
		}
		return temp; 
	}
	
}
