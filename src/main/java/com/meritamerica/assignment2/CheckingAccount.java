package com.meritamerica.assignment2;


public class CheckingAccount extends BankAccount {
	
	private static double INTEREST_RATE = 0.001;

	public CheckingAccount (double openingBalance) {
		super(openingBalance, INTEREST_RATE);
	}
}

