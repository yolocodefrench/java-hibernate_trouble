package entity;

import java.util.ArrayList;
import java.util.Collection;


public class Agence {
	
	public Agence(String code, String adresse) {
		this.setCode(code);
		this.setAdresse(adresse);
	}
	
	private int id;
	
	private String code;
	
	private String adresse;

    private Collection<CompteBancaire> compteAgences = new ArrayList<CompteBancaire>();
	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
