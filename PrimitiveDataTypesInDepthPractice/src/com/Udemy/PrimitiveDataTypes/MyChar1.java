package com.Udemy.PrimitiveDataTypes;

public class MyChar1 {
	private char ch;
	MyChar1(char ch){
		this.ch=ch;
	}
boolean isVowel() {
	if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'||
			ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U') {
		return true;
	}
		else return false;
	}
boolean isDigit() {
	if(ch>=48&&ch<=57) {
		return true;
	}
		else return false;
	}
boolean isAlphabet() {
	if(ch>=65&&ch<=90) {
		return true;
	}
	if(ch>=97^ch<=122)
		return true;
		else return false;
	}
boolean isConsonant() {
	if(isAlphabet()&&!isVowel()) {
		return true;
	}
		else return false;
	
}
public static void printLowerCaseAlphabets()
{
	for(char ch='a';ch<='z';ch++)
	{
		System.out.print(ch);;
}

}
public static void printUpperCaseAlphabets()
{
	for(char ch='A';ch<='Z';ch++)
	{
		System.out.print(ch);;
}

}
}