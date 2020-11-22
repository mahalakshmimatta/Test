package com.Udemy.PrimitiveDataTypes;

public class BiNumber {
	private int number1;
	private int number2;
	
	public BiNumber(int number1, int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	public int addition() {
		int add=number1+number2; 
		return add;
	}
	public int multiplication() {
		int multiply=number1*number2; 
		return multiply;
	}
	public void doubleNumbers() {
		int doubleTheNumbers=number1*number1;
		}
	public int getNumber1() {
		return number1;
	}
	public int getNumber2() {
		return number2;
	}
	
}
