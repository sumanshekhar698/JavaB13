package com.java.oops.abstraction.abstract_classes;

import com.java.oops.abstraction.ChildrenBankAccount;

public class Main {

	public static void main(String[] args) {

//		BankAccount tom = new BankAccount("Tom", 1000, false, "BLR10");//You cannot instantiate a abstract class DIRECTLY

		ChildrenBankAC tom = new ChildrenBankAC("Tom", 1000, false, "BLR10");// You cannot instantiate a abstract class
																				// DIRECTLY

		tom.depositMoney(1000);
		System.out.println(tom.getBalance());

		Dummy dum = new Dummy() {// Annonymous Inner Type

			@Override
			int foo() {
				System.out.println("foo");
				return "foo".length();
			}
		};
		
		dum.foo();

	}

}
