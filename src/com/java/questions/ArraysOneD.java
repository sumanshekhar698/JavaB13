package com.java.questions;

public class ArraysOneD {
	public static void main(String[] args) {
		int x = 9, arr[];
		arr = new int[10];

		int evenTracker = 0;
		System.out.println(arr);

		for (int num : arr) {
//			System.out.print(num + " ");
			 System.out.println();

			for (int i = 0; i <= arr.length - 1; i++) {
				arr[i] = evenTracker;
				evenTracker += 2;
			}
			
			System.out.println();

			for (int i = 0; i <= arr.length - 1; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}