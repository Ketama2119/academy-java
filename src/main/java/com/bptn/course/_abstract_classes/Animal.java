package com.bptn.course._abstract_classes;

//Abstract Animal class
abstract class Animal {
 // Abstract Method
 public abstract void sound();  // Must be overridden in subclasses

 // Concrete Method
 public void sleep() {
     System.out.println("Animal is sleeping");
 }
}

//Dog class extending Animal
class Dog extends Animal {
 @Override
 public void sound() {
     System.out.println("Dog barks");
 }
}

//Cat class extending Animal (assumed similar to Dog)
class Cat extends Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows");
 }
}

//Main class to run the program


