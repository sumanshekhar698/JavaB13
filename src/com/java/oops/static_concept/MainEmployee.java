package com.java.oops.static_concept;

public class MainEmployee {

	public static void main(String[] args) {
		
		final int x;
		x =9;
//		x =99;
		
		Employe emp1 = new Employe("John", "EMP1");// EMP1
		Employe emp2 = new Employe("Jane", "EMP2");
		Employe emp3 = new Employe("Jim", "EMP3");
		Employe emp4 = new Employe("Jim");
		Employe emp5 = new Employe("Jim");

		
		System.out.println(emp5.id);

	}

}
