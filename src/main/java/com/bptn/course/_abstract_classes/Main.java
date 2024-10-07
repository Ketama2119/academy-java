package com.bptn.course._abstract_classes;

public class Main {
	 public static void main(String[] args) {
	     Dog myDog = new Dog();  // Create Dog object
	     Cat myCat = new Cat();  // Create Cat object (assuming Cat exists)

	     myDog.sleep();  // Calls inherited sleep() from Animal
	     myDog.sound();  // Calls overridden sound() from Dog

	     myCat.sleep();  // Calls inherited sleep() from Animal
	     myCat.sound();  // Calls overridden sound() from Cat
	 }
}