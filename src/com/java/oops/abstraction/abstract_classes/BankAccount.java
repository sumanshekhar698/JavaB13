package com.java.oops.abstraction.abstract_classes;


//private   default protected public
public abstract class BankAccount {
	private final String name;
	private String bankName;
	protected long balance;
	boolean hasLoan;
	private String ifscCode;

	public BankAccount(String name, long balance, boolean hasLoan, String ifscCode) {

		this.name = name;
		this.bankName = "Children Bank";
		this.balance = balance;
		this.hasLoan = hasLoan;
		this.ifscCode = ifscCode;
	}

	abstract long withdrawMoney(long amount);// the  methods that dont have body and just the signature is called abstract methods

	abstract long depositMoney(long amount);

	
	
	public String getName() {
		return name;
	}

	public String getBankName() {
		return bankName;
	}

	public long getBalance() {
		return balance;
	}

	public boolean isHasLoan() {
		return hasLoan;
	}

	public String getIfscCode() {
		return ifscCode;
	}

}
