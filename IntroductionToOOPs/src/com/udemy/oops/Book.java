package com.udemy.oops;

public class Book {
	private int noOfCopies;
	/*void setNoOfCopies(int noOfCopies) {
		this.noOfCopies=noOfCopies;
	}
	public int getNoOfCopies() {
		return this.noOfCopies;
	}*/
	
	void read() {
		System.out.println("Art Of Computer Programming");
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public void increaseNoOfCopies(int howmuch) {
		noOfCopies=noOfCopies+howmuch;
	}
	void read2() {
		System.out.println("Effective Java");
	}
	void read3() {
		System.out.println("Clean Code");
	}

}
