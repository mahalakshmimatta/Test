package com.Udemy.PrimitiveDataTypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers=new BiNumber(5,6);
		System.out.println(numbers.addition());
		System.out.println(numbers.multiplication());
		numbers.doubleNumbers();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
		
		
	}

}
