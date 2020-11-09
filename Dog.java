package com.qa.community.animal;

public class Dog extends Animal {
	
	protected boolean isPet = true;
	
	public Dog() {
		super();
		this.isPet = true;
		this.setMammal(true);
		this.setSpecies("Dog");
	}

	public boolean isPet() {
		return isPet;
	}

	public void setPet(boolean isPet) {
		this.isPet = isPet;
	}
	
	@Override
	public void actions() {
		System.out.println(this.species + " "
				+ "will wag its tail if it thinks you're friendly");
	}
}
