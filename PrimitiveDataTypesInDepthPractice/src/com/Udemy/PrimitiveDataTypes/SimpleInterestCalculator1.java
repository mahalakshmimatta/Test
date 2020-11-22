package com.Udemy.PrimitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator1 {
	private BigDecimal principle;
	private BigDecimal interest;

	public SimpleInterestCalculator1(String principle, String interest) {
		this.principle=new BigDecimal(principle);
		this.interest=new BigDecimal(interest).divide(new BigDecimal(100));
	}
	public BigDecimal calculate(int noOfYears) {
		BigDecimal noOfYearsBigdecimal=new BigDecimal(noOfYears);
		BigDecimal totalValue=principle.
				add(principle.multiply(interest)
				.multiply(noOfYearsBigdecimal));
		return totalValue;
	}
}
