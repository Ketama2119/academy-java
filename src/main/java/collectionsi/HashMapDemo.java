package collectionsi;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> fruits = new HashMap<>();
		{
			fruits.put("Apple", 1);
			fruits.put("orange", 2);
			fruits.put("banana", 3);
			fruits.put("bluebery", 4);
			fruits.put("beans", 5);
			fruits.put("beans", 6);
			fruits.replace("banana", 7);
			System.out.println(fruits);
			System.out.println(fruits.get("banana"));

			if (fruits.containsKey("banana")) {
				System.out.println("The banana is in the fruit");

			}

		}
	}

}
