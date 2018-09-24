package entity;

public class CompteSimple extends CompteBancaire{
	
	public CompteSimple(String identifiant, int solde) {
		super(identifiant, solde);
	}

	private int decouvert=0;	
}
