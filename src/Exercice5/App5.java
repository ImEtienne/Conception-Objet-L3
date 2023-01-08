package Exercice5;

import java.util.ArrayList;

/**
 * 
 * @author etienne
 * Tuesday 04/10/2022
 */

public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Forme5> tab = new ArrayList<>();
		Carre5 carre = new Carre5(2.3, "mon carré magique");
		Disque5 disque = new Disque5(3.7, "mon disque magique");
		//Forme5 [] tab = new Forme5[] {carre,disque};
		
		tab.add(disque);
		tab.add(carre);
		GroupForme groupForm = new GroupForme(tab);
		System.out.println(groupForm);
	}

}
