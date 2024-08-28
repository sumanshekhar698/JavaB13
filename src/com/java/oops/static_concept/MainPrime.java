package com.java.oops.static_concept;

public class MainPrime {
	
	public static void main(String[] args) {
//		PrimeMinister pm1 = new PrimeMinister("Mr Modi", 65);
//		PrimeMinister pm2 = new PrimeMinister("Mr Rahul", 50);
		
		//TODO In any case you cannot have more than 1 PM
		
		PrimeMinister pm1 = PrimeMinister.electPm("Mr Modi", 65);
		System.out.println(pm1.hashCode());
		System.out.println(pm1.getName());

		PrimeMinister pm2 = PrimeMinister.electPm("Mr Rahul", 50);
		System.out.println(pm2.hashCode());
		System.out.println(pm2.getName());

	}

}
