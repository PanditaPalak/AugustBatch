package oops;
import java.util.Scanner;
/*
 * 
 * OOPs-->Object oriented programming system.
 * 1. Methodology to design a program using classes and objects.
 * 
 * It simplifies the development of software applications and their 
 * maintenance  by providing the methodology.
 * 
 * Concepts:
 * 1. Classes
 * 2. Objects
 * 3. Inheritance
 * 4. Polymorphism
 * 5. Abstraction
 * 6. Encapsulation
 * 
 * 1. Class: class is collection of objects/Logical entity/blueprint
 * 2. Object: Any entity that has state and behaviour/instance of a class/physical entity.
 * 3. Inheritance:
 *          
 *    It is a mechanism in which one object acquires the properties
 *     of its parent object.
 *     
 *     Types of Inheritance:
 *     
 *     1) Single inheritance
 *     2) Multilevel Inheritance
 * 
 * 
 * */


public class SingleTest {
	
	public static void main(String[] args)
	{
		Dog dog = new Dog();//child is inheriting the properties of parent class
		dog.eat();
		dog.sleep();
		dog.bark();
		
		
//		Animal animal = new Animal();
//		animal.eat();
//		animal.sleep();
		
	}
	

}
