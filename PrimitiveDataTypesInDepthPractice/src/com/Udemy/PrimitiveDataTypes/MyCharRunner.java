package com.Udemy.PrimitiveDataTypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar=new MyChar('9');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseLetters();
		System.out.println();
		MyChar.printUpperCaseLetters();
	}

}
