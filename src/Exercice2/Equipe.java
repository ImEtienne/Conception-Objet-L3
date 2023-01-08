package Exercice2;

import java.util.ArrayList;

public class Equipe {
	
	private ArrayList<Individu> tabI;
	
	public Equipe(ArrayList<Individu> tabI) {
		this.tabI = tabI;
	}
	
	/**
	 * @
	 */
	
	@Override
	public String toString() {
		String res = "";
		for(Individu i : tabI) {
			res = res + i.toString() + "\n"; 
		}
		return res;
	}

}
