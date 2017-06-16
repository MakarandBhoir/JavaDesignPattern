package verison0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
	
	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}
	
	public static void main(String args[]) {
		Person swati = new Person("Swati", "982122990", 27);
		Person deepak = new Person("Deepak", "982122991", 41);
		Person ashish = new Person("Ashish", "982122992", 38);
		
		List<Person> people = new ArrayList<Person>();
		people.add(swati);
		people.add(deepak);
		people.add(ashish);
		
		System.out.println("Not sorted");
		printContents(people);
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getAge() > o2.getAge()) {
					return 1;
				}
				
				if(o1.getAge() < o2.getAge()) {
					return -1;
				}
				
				return 0;
			}
		});
		
		System.out.println("\nSorted by age");
		printContents(people);
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("\nSorted by name");
		printContents(people);
		
	}
}
