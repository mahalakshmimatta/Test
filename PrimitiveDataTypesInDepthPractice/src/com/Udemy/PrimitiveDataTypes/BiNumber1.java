package com.Udemy.PrimitiveDataTypes;

public class BiNumber1 {
	private int number1,number2;
	
	public BiNumber1(int number1, int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	public int addition()
	{
		int add=number1+number2;
		return add;
	}
	public int subtraction()
	{
		int subtract=number1-number2;
		return subtract;
	}

	public int multiplication()
	{
		int multiply=number1*number2;
		return multiply;
	}
	public int divide()
	{
		int division=number1/number2;
		return division;
	}
	void doubleTheNumbers()
	{
		this.number1=number1*2;
		this.number2=number2*2;
	}
	public int getNumber1()
	{
		return number1;
		
	}
	public int getNumber2()
	{
		return number2;
		
	}

}
