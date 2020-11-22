package com.Udemy.PrimitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator1Runner {
	public static void main(String[] args) {
		SimpleInterestCalculator1 calculator=new SimpleInterestCalculator1("4500","7.5");
		BigDecimal TotalValue=calculator.calculate(5);
		System.out.println(TotalValue);
	}
}
