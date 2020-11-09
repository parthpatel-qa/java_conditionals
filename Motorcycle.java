package com.qa.community.garagetask;

public class Motorcycle extends Vehicle{
	
	protected boolean skipTraffic = true;
	
	public Motorcycle() {
		super();
		this.skipTraffic = true;
		this.numOfWheels = 2;
		this.colour = "Red";
		
	}

	public Motorcycle(boolean skipTraffic) {
		super();
		this.skipTraffic = skipTraffic;
	}

	public boolean isSkipTraffic() {
		return skipTraffic;
	}

	public void setSkipTraffic(boolean skipTraffic) {
		this.skipTraffic = skipTraffic;
	}
	
}
