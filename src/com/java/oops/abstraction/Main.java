package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {
		ChildrenBankAccount tom = new ChildrenBankAccount("Tom", 1000, false, "BLR10");
		System.out.println(tom.getBalance());
		System.out.println(tom.withdrawMoney(100000));

	}

}
