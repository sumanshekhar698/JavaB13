package com.java.oops.abstraction.interfaces;

public class ChildrenBankAC implements BankAC {
	private final String name;
	protected long balance;
	boolean hasLoan;
	private String ifscCode;

	public ChildrenBankAC(String name, long balance, boolean hasLoan, String ifscCode) {

		this.name = name;
		this.balance = balance;
		this.hasLoan = hasLoan;
		this.ifscCode = ifscCode;
	}

	@Override
	public long withdrawMoney(long amount) {//You cannot decrease the visblity
		if (balance < amount) {
//			LOG.warning("Insufficient Balance");
			System.out.println("Insufficent Balance");
			return -1;

		} else {
			balance -= amount;
			return amount;
		}

	}

	@Override
	public long depositMoney(long amount) {
		if (amount > 0) {
			balance += amount;
			return balance;

		} else {
			System.out.println("Incorrect Amount");

//			LOG.warning("Incorrect Amount");

			return -1;

		}

	}

}
