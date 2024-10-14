package com.bptn.course._20_iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorDemo {

	// private static Iterator<String> iterator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring arrayCollection
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Tesla");
		cars.add("BMW");
		cars.add("Lambourgin");
		cars.add("Hyundai");
		cars.add("Honda");
		cars.add("Ford");
		cars.add("Hammer");
//		for (String c : cars) {
//			System.out.println(c);
		// cars.clear();
		// System.out.println(cars.get(4));

		// System.out.println(cars);
		cars.set(2, "zucki");
		// System.out.println(cars);
//		}
//		Iterator<String> it = cars.iterator();
//		while (it.hasNext()) {
//			{
//				String car = it.next();
//				System.out.println(car);
//				if (car.equals("Tesla")) {
//					it.remove();
//				}
//
//			}
		ListIterator<String> c = cars.listIterator();
		// traverse forward
		while (c.hasNext()) {
			System.out.println(c.next());
		}
		System.out.println("back ward trasverse");

		while (c.hasPrevious()) {
			System.out.println(c.previous());
		}
//		List<String> luxurycar = new LinkedList<>();
//		luxurycar.add("BMW");
//		luxurycar.add("Tesla");
		// luxurycar.add("JVC");
//		luxurycar.add("Hyundai");
//		cars.add("Honda");
//		cars.add("Ford");
//		luxurycar.add("Hammer");
//		cars.retainAll(luxurycar);
		// System.out.println(cars);
	}
}

// System.out.print(cars);
