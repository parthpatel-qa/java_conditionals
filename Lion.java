package com.qa.community.animal;

public class Lion extends Animal{
	
	//Attributes
	protected boolean canRoar = true;
	protected boolean carnivore = true;
	
	//Constructors
	public Lion() {
		super();
		this.canRoar = true;
		this.carnivore = true;
		this.setSpecies("Lion");
		this.setColour("Gold"); 
		this.setSize("Medium");
		
	}
	//methods
	public boolean canRoar() {
		return canRoar;
	}

	public void setCanRoar(boolean canRoar) {
		this.canRoar = canRoar;
	}

	public boolean carnivore() {
		return carnivore;
	}

	public void setCarnivore(boolean carnivore) {
		this.carnivore = carnivore;
	}
	
	@Override
	public void actions() {
		System.out.println(this.species + " "
				+ "will eat you if you get too close!");
	}
	
	
	
}
