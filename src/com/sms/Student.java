package com.sms;

public class Student {

	private int id;
	private String name;
	private double marks;
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	
	public String toFileString() {
		return id + ", " + name + ", " + marks;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "name: " + name + "marks: " + marks;
	}
}
