package com.java.oops.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {
//		BankAC bankAC = new BankAC();//You cannot instantiate a interface DIRECTLY

		ChildrenBankAC jane = new ChildrenBankAC("Jane", 1000, false, "CB167");
		jane.withdrawMoney(100);
		System.out.println(jane.balance);

		Dummy dum = new Dummy() {

			@Override
			public int foo() {
				System.out.println("foo");
				return 0;
			}
		};
		
		dum.foo();

	}

}
