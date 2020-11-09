package com.qa.community.garagetask;

public class Car extends Vehicle{
	
	protected boolean hasSunroof = true;
	
	public Car() {
		super();
		this.hasSunroof = true;
		this.colour = "black";
	}

	public Car(boolean hasSunroof) {
		super();
		this.hasSunroof = hasSunroof;
	}

	public boolean isHasSunroof() {
		return hasSunroof;
	}

	public void setHasSunroof(boolean hasSunroof) {
		this.hasSunroof = hasSunroof;
	}
	
	
	
	
}
