package com.udemy.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike gixer=new MotorBike();
		MotorBike ktm=new MotorBike();
		gixer.start();
		ktm.start();
		ktm.stop();
		gixer.setSpeed(120);
		//ktm.setSpeed(100);
		//System.out.println(gixer.getSpeed());
		System.out.println(ktm.getSpeed());
		
	}

}
