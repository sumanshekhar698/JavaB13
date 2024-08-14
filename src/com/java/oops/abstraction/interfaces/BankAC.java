package com.java.oops.abstraction.interfaces;

public interface BankAC {
	

	String BANK_NAME = "Children Bank";//public static final



	 long withdrawMoney(long amount);// the  methods that dont have body and just the signature is called abstract methods

	abstract long depositMoney(long amount);

	

}
