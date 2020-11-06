package src.main;

import java.util.ArrayList;


public class Runner {
	public static void main(String[] args) {
		
		ArrayList<Person> People = new ArrayList<>();
		
		/*
		 * Person Bob= new Person("Bob", 43); Person Barbara= new Person("Barbara", 4);
		 * Person James= new Person("James", 3); Person Kyle= new Person("Kyle", 50);
		 * Person Romeo= new Person("Romeo", 26); Person Julio= new Person("Julio", 46);
		 * Person Donald= new Person("Donald", 43);
		 */
		
		People.add(new Person("Bob", 43));
		People.add(new Person("Barbara", 4));
		People.add(new Person("James", 3));
		People.add(new Person("Kyle", 50));
		People.add(new Person("Romeo", 26));
		People.add(new Person("Julio", 46));
		People.add(new Person("Donald", 43));
		
		for(Person handle: People) {
			System.out.println(handle.getName());
		}
	}
}
