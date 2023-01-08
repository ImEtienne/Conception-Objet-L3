package Exercice2;

public class Militaire extends Individu{
	private String grade;
	private boolean enService;
	
	public Militaire(String nom, int anneeNaissance, String grade, boolean enService) {
		super(nom, anneeNaissance);
		this.grade = grade;
		this.enService = enService;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String isEnService(boolean enService) {
		if(enService) return "Il est en service"; 
		return "Il est réservice";
	}

	public void setEnService(boolean enService) {
		this.enService = enService;
	}

	public String toString() {
		return super.toString() + " " + this.grade + ". " + isEnService(enService); // le slash n (\n) permet de passer à la ligne.
	}
	

}
