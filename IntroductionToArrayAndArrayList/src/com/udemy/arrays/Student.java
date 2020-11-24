package com.udemy.arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student {
	private String name;
	private int[]marks;
	Student(String name, int[]marks){
		this.name=name;
		this.marks=marks;
		}
	int[] getNumberOfMarks() {
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		return marks;
	}
	int getTotalSumOfMarks() {
		int totalMarks=0;
		for(int i=0;i<marks.length;i++) {
			totalMarks=marks[i]+totalMarks;
			}
		System.out.println(totalMarks);
		
		return totalMarks;
	}
	int getMaximumMark() {
		Arrays.sort(marks);
		int length=marks.length;
		System.out.println(marks[length-1]);
		return marks[length-1];
	}
	int getMinimumMark() {
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		return marks[0];
	}
	BigDecimal Average() {
		int length=marks.length;
		int i=0;
		BigDecimal averageOfMarks=((new BigDecimal(marks[i])).
				add(new BigDecimal(marks[i+1])).
				add(new BigDecimal(marks[i+2]))).
			divide(new BigDecimal(length));
		System.out.println(averageOfMarks);
		
		return averageOfMarks;
		
	}
	
}
