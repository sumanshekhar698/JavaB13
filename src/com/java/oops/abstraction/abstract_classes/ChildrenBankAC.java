package com.java.oops.abstraction.abstract_classes;

public class ChildrenBankAC extends BankAccount {

	public ChildrenBankAC(String name, long balance, boolean hasLoan, String ifscCode) {
		super(name, balance, hasLoan, ifscCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	long withdrawMoney(long amount) {
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
	long depositMoney(long amount) {
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
