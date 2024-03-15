package com.javaws.entities;
import java.io.Serializable;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String numero;
	private String titulaire;
	private double solde;

	public Account() {
	}

	public Account(String numero, String titulaire, double solde) {
		this.numero = numero;
		this.titulaire = titulaire;
		this.solde = solde;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public String getTitulaire() {
		return titulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
		
}
