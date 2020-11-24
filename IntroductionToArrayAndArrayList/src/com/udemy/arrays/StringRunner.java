package com.udemy.arrays;

public class StringRunner {

	public static void main(String[] args) {
     String[] daysOfWeek= {"sunday","Monday","Tuesday","Wednesday","thursday","friday","saturday"};
	    	String bigDayInWords="";
	    	for(String day:daysOfWeek) {
	    		if(day.length()>bigDayInWords.length()) {
	    		bigDayInWords=day;	
	    		}
	    		}
	    	System.out.println("lengthy day in words" +bigDayInWords);
	    	
	 
	for(int i=daysOfWeek.length-1;i>=0;i--) {
		System.out.println(daysOfWeek[i]);
	}

}
}
