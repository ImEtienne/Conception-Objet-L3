package Exercice2;

public class Etudiant extends Individu {
	private String formation;

	public Etudiant(String nom, int anneeNaissance, String formation) {
		super(nom,anneeNaissance );
		this.formation = formation;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.getFormation();
	}

}
