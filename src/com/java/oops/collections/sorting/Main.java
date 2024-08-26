package com.java.oops.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>() {
			{
				add(5);
				add(15);
				add(35);
				add(54);
				add(15);
				add(-5);
			}
		};

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(4, "Pam"));
		listOfStudents.add(new Student(2, "Trump"));
		listOfStudents.add(new Student(3, "Tom"));
		listOfStudents.add(new Student(7, "Tom"));
		listOfStudents.add(new Student(8, "Mary"));
		listOfStudents.add(new Student(9, "Tim"));

//		Collections.sort(listOfStudents, new IdComparator());
		Collections.sort(listOfStudents, (s1,s2)->{
			return -s1.name.compareTo(s2.name);
		});
		listOfStudents.forEach(System.out::println);

	}

}

class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.id == s2.id) {
			return 0;
		} else if (s1.id > s2.id) {
			return 7;// any +ve
		} else {
			return -1;
		}
	}

}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}

}