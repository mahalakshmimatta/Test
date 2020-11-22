package com.udemy.oops;
public class Book1Runner {

	public static void main(String[] args) {
		Book1 coreJava=new Book1();
		Book1 javaProgramming=new Book1();
		coreJava.read();
		javaProgramming.read();
		coreJava.setNoOfCopies(5);
		javaProgramming.setNoOfCopies(90);
		System.out.println(coreJava.getNoOfCopies());
		System.out.println(javaProgramming.getNoOfCopies());
		javaProgramming.increaseNoOfCopies(50);
		System.out.println(javaProgramming.getNoOfCopies());
		
	/*	int noOfCopies=coreJava.getNoOfCopies();
		noOfCopies=noOfCopies+100;
coreJava.setNoOfCopies(noOfCopies);
System.out.println(coreJava.getNoOfCopies());

int noOfCopies1=javaProgramming.getNoOfCopies();
noOfCopies1=noOfCopies1+100;
javaProgramming.setNoOfCopies(noOfCopies1);
System.out.println(javaProgramming.getNoOfCopies());
*/
		/*coreJava.noOfCopies=34;
		javaProgramming.noOfCopies=50;*/
	}

}
