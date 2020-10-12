package com.meritamerica.assignment2;

public class CDOffering {

	private int term;
	private double interestRate;

	public CDOffering(int term, double interestRate){		 
	      this.term = term;
	      this.interestRate = interestRate;
	}

	// CDOffering() {} -- default constructor

	public int  getTerm() {	 
		return term;
	}
 
	public double getInterestRate() {
		return interestRate;
	 	 
	}

	public static CDAccount cdAccount() {
	
		return cdAccount();
	}
 
}