package entity;

public class ComptePayant extends CompteBancaire{
	public ComptePayant(String identifiant, int solde) {
		super(identifiant, solde);
		// TODO Auto-generated constructor stub
	}
	public void versement( float montant) {
		montant-=5;
		this.solde += montant;
	}
	public void retrait( float montant) {
		montant-=5;
		this.solde -= montant;
	}
}
