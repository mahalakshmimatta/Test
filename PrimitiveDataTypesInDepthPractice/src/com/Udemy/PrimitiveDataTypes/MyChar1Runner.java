package com.Udemy.PrimitiveDataTypes;

public class MyChar1Runner {
public static void main(String[] args) {
	MyChar1 myChar=new MyChar1('i');
	System.out.println(myChar.isVowel());
	System.out.println(myChar.isDigit());
	System.out.println(myChar.isAlphabet());
	System.out.println(myChar.isConsonant());
	MyChar.printLowerCaseLetters();
	MyChar.printUpperCaseLetters();
	
}
}
