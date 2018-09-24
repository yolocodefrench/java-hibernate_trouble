package entity;

public abstract class CompteBancaire {
	protected int idAgence;
	protected String identifiant ="";
	protected float solde = 0;
	
	public CompteBancaire(String identifiant, int solde ) {
		this.setIdentifiant(identifiant);
		this.setSolde(solde);
	}
	
	public void versement( float montant) {
		this.solde += montant;
	}
	public void retrait( float montant) {
		this.solde -= montant;
	}
	
	public String toString(){
		return "Le montant du compte est "+this.solde;
	}
	
	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

}
