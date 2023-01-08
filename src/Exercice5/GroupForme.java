package Exercice5;

import java.util.ArrayList;

/**
 * 
 * @author etienne
 * Tuesday 04/10/2022
 *
 */

public class GroupForme {
	//private Forme5 [] tab;
	private ArrayList<Forme5> tab;
	
	public GroupForme(ArrayList<Forme5> tab) {
		this.tab = tab;
	}
	
	@Override
	public String toString() {
		String res = "";
		for(Forme5 i :tab) res = res + i.toString() + "\n";
		return res;
	}
	
	
}
