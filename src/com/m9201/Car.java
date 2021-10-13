package com.m9201;

public class Car {
	
	private int speed;
	private String doors;
	private String driver;
	private String engins;
	
	//default constructor
	public Car() {
		doors = "closed";
		driver= "seated";
		engins = "on";
		speed = 15;
	}
	
	// parameterized constructor
	public Car(String doors, String engins, String driver, int speed) {
		this.doors = doors;
		this.driver= driver;
		this.engins = engins;
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getEngins() {
		return engins;
	}
	public void setEngins(String engins) {
		this.engins = engins;
	}
	
	public String run() {
		if(doors.equals("closed") && engins.equals("on")  && speed > 0) {
			return "runing";
		}else {
			return "not running";
		}
	}
	
//	public int getSpeed(){
//		return speed;
//	}
//	
//	public void setSpeed(int spd) {
//		this.speed = spd;
//	}

}
