package com.udemy.oops;

public class BookRunner {
public static void main(String[] args) {
	Book artOfComputerProgramming=new Book();
	artOfComputerProgramming.read();
	Book effectiveJava=new Book();
	effectiveJava.read2();
	Book cleanCode=new Book();
	cleanCode.read3();
	/*artOfComputerProgramming.setNoOfCopies(89);
	effectiveJava.setNoOfCopies(99);
	cleanCode.setNoOfCopies(79);*/
	effectiveJava.setNoOfCopies(45);
	System.out.println(effectiveJava.getNoOfCopies());
	effectiveJava.increaseNoOfCopies(5);
	System.out.println(effectiveJava.getNoOfCopies());
}
}
