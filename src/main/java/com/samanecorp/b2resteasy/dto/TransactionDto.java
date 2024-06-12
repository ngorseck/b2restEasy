package com.samanecorp.b2resteasy.dto;

public class TransactionDto {

	private long id;
	private double montant;
	
	public TransactionDto(long id, double montant) {
		super();
		this.id = id;
		this.montant = montant;
	}

	public TransactionDto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
}
