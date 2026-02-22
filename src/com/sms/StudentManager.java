package com.sms;

import java.io.*;
import java.util.*;

public class StudentManager {

	private ArrayList<Student> students = new ArrayList<>();
	private final String fileName = "C:\\Users\\K VAMSHIDHAR REDDY\\Desktop\\JAVA\\students.txt";
	
//	Add Student
	public void addStudent(Student student) {
		try (FileWriter fw = new FileWriter(fileName, true);
				BufferedWriter bw = new BufferedWriter(fw)){
			
			bw.write(student.toFileString());
			bw.newLine();
			System.out.println("Student added Successfully");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

//	View Student
	public void viewStudents() {
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Marks: " + data[2]);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("No records found");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
