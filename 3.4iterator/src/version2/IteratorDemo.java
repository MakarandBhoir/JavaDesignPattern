package version2;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		BikeRepository repo = new BikeRepository();
		
		repo.addBike("Royal Enfield");
		repo.addBike("Suzuki KTM");
		repo.addBike("Kawasaki");
		
		Iterator<String> bikeIterator = repo.iterator();
		
		//while(bikeIterator.hasNext()) {
		//	System.out.println(bikeIterator.next());
		//}
		
		for (String bike : repo) {
			System.out.println(bike);
		}
	}
}
