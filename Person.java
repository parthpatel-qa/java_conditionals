package src.main;

public class Person {
	
	public String personName;
	public Integer personAge;
	
	public Person() {
		personFirstName = "";
		personAge =0 ;
	}
	
	public Person(String name, int age) {
		this.personName =name;
		this.personAge = age;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getPersonAge() {
		return personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}
}
