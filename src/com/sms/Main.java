package com.sms;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		
		while(true) {
			System.out.println("\n==== Student Management System ====");
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Exit");
			System.out.println("Choose Option: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				
				System.out.print("Enter marks: ");
				double marks = sc.nextDouble();
				
				Student student = new Student(id, name, marks);
				manager.addStudent(student);
				break;
				
			case 2:
				manager.viewStudents();
				break;
			
			case 3:
				System.out.println("Exiting...");
				System.exit(0);
			
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}
}
