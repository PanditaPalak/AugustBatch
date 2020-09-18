package strings;

public class StringsDemo {
	
	void demo()
	{
		String name = "Pratiksha";
		System.out.println("Name is : "+name);
		// charAT
		System.out.println("charAT(): "+name.charAt(6));
		//equals --> content comparison
		String s1 ="PriPyaP";
		System.out.println("Equals(): "+s1.equals(name));
		//equalsIgnoreCase
		System.out.println("Equals Ignore case: "+s1.equalsIgnoreCase("PRIYA"));
		//length
		System.out.println("Length(): "+name.length());
		//replace
		System.out.println("Replace(): "+s1.replace('P','A'));
	    //SUbstring --PriPyaP
		System.out.println("Substring(): "+s1.substring(2));
		System.out.println("SUbstring: "+s1.substring(2,6));
	   //Lowercase
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String s2 ="   RAM   ";
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(name.indexOf('a'));
		
		
		String s4 = "Application";
		char array[] = s4.toCharArray();
		System.out.println(array);
		for(int i=0;i<s4.length();i++)
		{
			System.out.print(array[i]+"  ");
		}
		
	
	
	}
	
	
	

}
/*
 * String --> class
 * 
 * string is an object that represents a sequence of 
 * characters and is created using String class.
 * 
 * using this we create objects of string.
 * 
 * "hello" -->array of characters.
 * 
 * 0  1  2  3  4  
 * h  e  l  l  o
 * 
 * Creation of object of string:
 * 
 * 1. Using string literal.
 * 2. Using new keyword.
 * 
 * 
 * Using string literal:
 *  
 *   String literal is created using " ".
 *   
 *    String name =  "Rahul";
 *    
 * Using new keyword:
 *    String name  = new String("Rahul");
 * 
 * Strings are immutable:
 * Unmodifiable/unchangeable
 * 
 * String s1 = "Rahul";
 * 
 * s1.concat("Koul");
 * 
 * syso(s1);
 * 
 * 
 * 
 * 
 * 
 * */
 