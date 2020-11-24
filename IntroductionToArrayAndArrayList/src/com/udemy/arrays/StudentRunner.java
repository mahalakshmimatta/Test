package com.udemy.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks= {100,99,89};
		Student student=new Student("maha",marks);
		int[] number=student.getNumberOfMarks();
		int sum=student.getTotalSumOfMarks();
		int maximumMark=student.getMaximumMark();
		int minimumMark=student.getMinimumMark();
		BigDecimal averageMarks=student.Average();
	}

}
