package com.Udemy.PrimitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principle;
	BigDecimal Interest;
	public SimpleInterestCalculator(String principle, String interest) {
		this.principle=new BigDecimal(principle);
		this.Interest=new BigDecimal(interest).divide(new BigDecimal(100));
	}
	BigDecimal calculateTotalAmount(int noOfYears) {
		BigDecimal noOfYearsBigDecimal=new BigDecimal(noOfYears);
		BigDecimal TotalAmount=principle.
				add((principle).
				multiply(Interest).multiply(noOfYearsBigDecimal));
		System.out.println(TotalAmount);
		
		return TotalAmount;
		}
}