package com.Udemy.PrimitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalc {
	private BigDecimal principle;
	private BigDecimal interest;
	private int noOfYears;
SimpleInterestCalc(String principle,String interest){
	this.principle=new BigDecimal(principle);
	this.interest=new BigDecimal(interest).divide(new BigDecimal(100));
}
BigDecimal totalValue(int noOfYears) {
	BigDecimal noOfYearsBigDecimal=new BigDecimal(noOfYears);
	BigDecimal TotalAmount=principle.
			add((principle).
			multiply(interest).
			multiply(noOfYearsBigDecimal));
	return TotalAmount ;
}
}
