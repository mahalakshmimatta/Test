package com.udemy.oops;

public class MotorBike {
	
	//state of bike
	private int speed;
	void setSpeed(int speed) {
		System.out.println(speed);
		System.out.println(this.speed);
	this.speed=speed;	
	}
	int getSpeed() {
		return this.speed;
		
	}
	
	void start() {
		System.out.println("started");
	}
	void stop() {
		System.out.println("stopped");
	}

}
