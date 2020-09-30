package collection;

import java.util.Enumeration;
import java.util.Vector;

//to retrieve object..following concepts are supposed to be used.
public class EDemo {
	
	public static void main(String[] args)
	{
		
		Vector v = new Vector();
		
		for(int i=0;i<5;i++)
		{
			v.addElement(i);
		}
		
		System.out.println("objects : "+v);
		
		Enumeration e = v.elements(); 
		
		while(e.hasMoreElements())
		{
			Integer i = (Integer) e.nextElement();
			
			if(i % 2 == 0)
			{
				System.out.println(i+" is even");
			}
			else
			{
				System.out.println(i+" is odd");
			}
			
		}
		
	}
	

}

//Enumeration --> 2 methods
