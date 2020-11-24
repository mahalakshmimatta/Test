package com.udemy.arrays;

public class Student1Runner {

	public static void main(String[] args) {
		Student1 student=new Student1("maha",new int[] {100,98,99});
		System.out.println(student.getNumberOfMarks());
		System.out.println(student.getSumOfMarks());
		System.out.println(student.getMaxOfMarks());
		System.out.println(student.getMinOfMarks());
		System.out.println("avg is "+student.getAvgOfMarks());
		
		System.out.println(student);
		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(1);
		System.out.println(student);
	}
	}
