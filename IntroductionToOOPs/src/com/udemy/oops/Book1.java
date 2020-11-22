package com.udemy.oops;

public class Book1 {
	private int noOfCopies;
/*	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies=noOfCopies;
	}
	public int getNoOfCopies() {
		return this.noOfCopies;
	}*/
	public void read() {
    	  System.out.println("reading");
      }
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		//System.out.println(noOfCopies);
		//System.out.println(this.noOfCopies);
		
		this.noOfCopies = noOfCopies;
		
	}
	public void increaseNoOfCopies(int howmuch) {
		noOfCopies=noOfCopies+howmuch;
		this.noOfCopies=noOfCopies;
	}
}
