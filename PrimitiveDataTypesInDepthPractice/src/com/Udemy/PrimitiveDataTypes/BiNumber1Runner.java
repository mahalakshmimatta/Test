package com.Udemy.PrimitiveDataTypes;

public class BiNumber1Runner {

	public static void main(String[] args) {
		BiNumber1 numbers=new BiNumber1(2,3);
		System.out.println(numbers.addition());
		System.out.println(numbers.subtraction());
		System.out.println(numbers.multiplication());
		System.out.println(numbers.divide());
		numbers.doubleTheNumbers();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());		
	}

}
