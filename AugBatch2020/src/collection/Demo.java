package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Demo {

	
	public static void main(String[] args)
			{    
		
		PriorityQueue pq = new PriorityQueue();
		pq.offer(65);
		pq.offer(15);
		pq.offer(87);
		pq.offer(55);
		pq.offer(23);
		pq.offer(98);
		System.out.println(pq);
		System.out.println(pq.peek());//null
		System.out.println(pq.element());//exception
		System.out.println(pq.poll());
		
		
		
			}
	}

/*
 * 1. Enumeration --interface
 *    2 methods -->  boolean hasMoreElements();
 *              -->  object nextElement();
 *              
 *              
//		     Vector v =new Vector();
//		     for(int i=0; i<10;i++)
//		     {
//		    	 v.addElement(i);
//		     }
//		     System.out.println("Vector : "+v);
//		     
//		     Enumeration e = v.elements();
//		     while(e.hasMoreElements())
//		     {
//		    	     Integer i  = (Integer) e.nextElement();
//		    	   
//		    	     if(i % 2 == 0)
//		    	     {
//		    	    	 System.out.println(i+" is even");
//		    	     }
//		    	     else
//		    	     {
//		    	    	 System.out.println(i+" is odd");
//		    	     }
//		     }

		
		

 *              
 * 2. Iterator interface
 * 	  3 methods --> boolean hasNext();
 * 				--> Object next();
 * 				--> void remove();
 * ArrayList al = new ArrayList();
		for(int i=0;i<5;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Integer i = (Integer) it.next();
			
			if(i % 2 == 0)
			{
				System.out.println(i+ " is even");
			}
			else
			{
				it.remove();
			}
		}
		System.out.println(al);
		
  3.ListIterator
      methods: -->  boolean  hasNext();
      				boolean  hasPrevious();
      				Object next();
      				Object previous();
      				void remove();
      				void set(Object newObject);
      				
      					LinkedList l = new LinkedList();
		  l.add("apple");
		  l.add("Orange");
		  l.add("Pear");
		  l.add("Banana");
		  
		  System.out.println(l);
		  ListIterator lt = l.listIterator();
		  while(lt.hasNext())
		  {
			  String s = (String) lt.next();
			  
			  if(s.equals("apple"))
			  {
				  lt.add("Elephant");
				  System.out.println(l);
				  
			  }
			  else if(s.equals("Banana"))
			  {
				  lt.set("Apricot");
				  System.out.println(l);
			  }
			  
		  }
 * 
 * 
 * Set Interface:
 *  1.insertion order is not preserved.
 *  2.duplicate objects are not allowed.
 *  
 *  HashSet
 *    underlying data str is HashTable
 *  1.  child implementing class of Set
 *  2.  Insertion order is not preserved.
 *      Hashcode of objects.
 *  3.  Duplicate objects are not allowed.
 *  4.  null insertion is possible
 *  5.  Hetergenous objects are allowed.
 *  
 *  Sorted Set:
 *  1. duplicate objects are not allowed.
 *  2. Insertion order is not preserved.
 *   based on some sorting order.
 * 
 *   Default natural sorting order
 *   Customized sorting order.
 * 
 * methods:
 * [100,101,102,103,104,105,106]
 * 
 *    Object first(); --100
 *    Object last(); -- 106
 *    SortedSet headSet(Object obj);
 *     headSet(104) -- [100,101,102,103]
 *    SortedSet tailSet(Object obj);
 *     tailSet(104) -- [104,105,106]
 *     SortedSet  subset(ob1,ob2);
 *     subset(103,105)--[103,104]
 *     Comparator comparator(); --null
 *     
 *     TreeSet
 *     
 *     1. D.S is balanced Tree
 *     2.Duplicates are not allowed.
 *     3.Insertion order is not preserved
 *     4.Heterogenous objects not allowed.
 *    
 *    Queue:
 *    prior to processing
 *    
 *    
 * TreeSet ts = new TreeSet(new MyComp());
			ts.add(87);
			ts.add(7);
			ts.add(8);
			ts.add(97);
			ts.add(17);
			ts.add(27);
			
			System.out.println(ts);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
 