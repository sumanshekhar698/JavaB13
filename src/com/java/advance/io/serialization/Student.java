package com.java.advance.io.serialization;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {// Serializable -> marker interface

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int id;//Private instance var are serialized
	 transient String name;

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
