package com.udemy.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student1 {
	private String name;
	private ArrayList<Integer> marks=new ArrayList<Integer>();
	//private int[] marks;
	Student1(String name,int... marks){
		this.name=name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
		}
	public int getSumOfMarks() {
		int sum=0;
		for(int mark:marks) {
			sum+=mark;
		}
		return sum;
	}
	public int getNumberOfMarks() {
		return marks.size();
	
	}
	public int getMaxOfMarks() {
		return Collections.max(marks);
	
	}
	public int getMinOfMarks() {
		return Collections.min(marks);
		}
	public BigDecimal getAvgOfMarks() {
		/*
		 * int sumOfMarks=getSumOfMarks(); int numberOfMarks=getNumberOfMarks();
		 * 
		 * return new BigDecimal(sumOfMarks).divide(new BigDecimal(numberOfMarks),
		 * 3,RoundingMode.UP);
		 */	
	BigDecimal average=new BigDecimal(getSumOfMarks()).divide(new BigDecimal(
			getNumberOfMarks()),3,RoundingMode.DOWN);
	return average;
	}
	public String toString() {
		return name+marks;
	}
	
	public void addNewMark(int mark) {
		marks.add(mark);
		
	}
	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
