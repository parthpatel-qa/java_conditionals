package com.qa.community.animal;

public class Animal {
	
	//attributes

		protected String size = "";
		protected int numOfLegs = 4;
		protected String species = "Animal";
		protected String colour = "";
		protected boolean isMammal = true;
		
	//constructors
		public Animal() {
			super();
			this.colour = "black";
			this.numOfLegs = 4;
			this.species = "animal";
			this.size = "";
			this.isMammal = true;
		}

	public Animal(String size, int numOfLegs, String species, String colour, boolean isMammal) {
		super();
		this.size = size;
		this.numOfLegs = numOfLegs;
		this.species = species;
		this.colour = colour;
		this.isMammal = isMammal;
	} 
	
	//methods
	public void actions() {
		System.out.println(this.species + " "
				+ "will run away if you get too close");
		
	}
	
	public void giveFood() {
		System.out.println(this.species + " " + "will let you pet it if you have snacks!");
	}
	
	public void animalProfile() {
		System.out.println("These are the details of this animal:" +"\n"+"Species- "+ this.species+ "\n"+ "Colour- "+ this.colour + "\n"+ "Size- " + this.size +"\n"+ "Number of legs- " +this.numOfLegs);
	}
	//Getters and Setters

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isMammal() {
		return isMammal;
	}

	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}
	
	
	
	
		
		
}
