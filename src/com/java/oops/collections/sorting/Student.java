package com.java.oops.collections.sorting;

public class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student st) {
		if (st.id == this.id) {
			return 0;
		} else if (st.id > this.id) {
			return 7;// any +ve
		} else {
			return -1;
		}

	}

}
