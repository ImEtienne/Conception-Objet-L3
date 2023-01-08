package Exercice2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individu individu1 = new Individu("Shyam", 2000);
		Individu individu2 = new Individu("Mohammad", 2001);
		Individu individu3 = new Individu("Madj", 2001);
		Individu individu4 = new Individu("Farhat", 2001);
		Etudiant etudiant1 = new Etudiant("kattan", 2003, "Informatique");
		Militaire militaire = new Militaire("kattan", 1997, "major", false );
		//Individu [] tab = new Individu [] {individu1, individu2, individu3, individu4, etudiant1, militaire};
 		
		ArrayList<Individu> tab = new ArrayList<>();
		
		tab.add(individu1);
		tab.add(individu2);
		tab.add(individu3);
		tab.add(individu4);
		tab.add(etudiant1);
		tab.add(militaire);
		
 		Equipe e = new Equipe(tab);
		System.out.println(e);
	}

}
