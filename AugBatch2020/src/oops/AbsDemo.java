package oops;
/*Data Hiding
 * 
 * Data should not be accessed by any outsider.
 * Security is achieved using this concept.
 * we can achieve it using the modifier "private".
 * 
 * **************
 * Abstraction
 * 
 * vehicle
 * { 
 *   move()
 *   noOfGears()
 *   noOfWheels()
 *   color()
 *   seatingCapacity()
 *   variant()
 *   soundSystem()
 *   flyingProperty()
 * }
 * 
 * The process of hiding the implementation and displaying only
 * the important features is called as abstraction.
 * 
 * we can achieve security as we are not highlighting the internal
 * details.
 * 
 * we can achieve abstraction by two ways:
 * a) ABstract class
 * b) INterface
 * 
 * 1.When we know the complete implementation,--> concrete class
 * 2.When we don't know about complete implementation,and we
 *   have partial implementation --> abstract class
 * 3.When we don't know about implementation and i have to provide 
 *   specification -->Interface
 *   
 *   Abstract Class:
 *        A class which is declared as abstract is called as abstract
 *        class.
 *        An abstract class can have abstract /non abstract methods.
 *        An abstract class cannot be instantiated.
 *        An abstract class can have constructors,static methods.
 * 
 * */

abstract public class AbsDemo {
	
	AbsDemo()
	{
		System.out.println("Abstract  class cons calling");
	}
	
	           void display()
	            {
	            	System.out.println("concrete method/normal method/non abstract");
	            }
	            
	            
	            abstract void show();
	            
//	            abstract void getDetails();
//	            
//	            abstract void showDetails();
//	            
	          
//abstract method-- no implementation
}












