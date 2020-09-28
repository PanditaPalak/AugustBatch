package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class TesdtDemo {
	
	void arrayListDemo()
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(45.77);
		al.add("rahul");
	
		System.out.println(al);
		
//		System.out.println(al.size());
//		
//		System.out.println(al);
//		al.remove(3);
		System.out.println("Arraylist 1: "+ al);
		
		ArrayList al1 = new ArrayList();
		al1.add('w');
		al1.add(9888);
		al1.add(200);
		al1.add(200);
		al1.add(null);
		System.out.println("Arraylist 2: "+ al1);
		
		al.addAll(al1);
		System.out.println("Array list 1: "+al);
		
		al.set(3, 67777);
		System.out.println(al);
		
		System.out.println(al.get(7));
		System.out.println(al.lastIndexOf(200));
		al.retainAll(al1);
		System.out.println("retain: "+al);
		al.add(4, 87777);
		System.out.println(al);
	}
	
	void linkedDemo()
	{
		LinkedList list1 = new LinkedList();
		list1.add(45);
		list1.add(77.5);
		list1.add("priya");
		list1.add(99);
		System.out.println("List1: "+list1);
		list1.addFirst(999999);
		list1.addLast(5600);
		System.out.println("List1: "+list1);
		list1.removeFirst();
		list1.removeLast();
		System.out.println("List1: "+list1);
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
	}
	
	void vectorDemo()
	{
		Vector list1 = new Vector();
		list1.add(45);
		list1.add(77.5);
		list1.add("priya");
		list1.add(99);
		list1.addElement(45555);
		list1.add(45);
		System.out.println(list1);
		list1.removeElement(45);
		System.out.println(list1);
		list1.removeElement(45);
		System.out.println(list1);
		
	}
	void stackDemo()
	{
		  Stack s = new Stack();
		  s.add(45);
		  s.add(66);
		  s.add(99);
		  s.push(22);
		  System.out.println(s);
		  s.pop();
		  System.out.println(s);
		  
		  System.out.println(s.peek());
		  System.out.println(s.search(45));
		  
	}
	

}

/*Collection Interface
 * 
 * boolean add(Object object);
 * boolean addAll(Collection collection);
 * boolean removeAll(Collection collection);group of objects
 * boolean retainAll(Collection collection);
 * removes all objects except elements mentioned in collection.
 * void clear();
 * removes all objects.
 * boolean  contains(Object object);
 * boolean isEmpty();
 * int size();
 * Object[] toArray();
 * Iterator iterator();
 *   it is used to iterate the objects one by one.
 * 
 * 
 * List Interface:
 * 1. insertion oreder is preserved
 * 2. duplicate objects are allowed.
 * 
 * 
 * ArrayList:
 *    1. child implementing  class of list Interface.
 *    2. Insertion order is preserved
 *    3. Duplicate objcts are allowed.
 *    4. Underlying data structure is growable array.
 *    5. Hetergenous objects are allowed.
 *    6. null insertion is also possible.
 *    
 *    ArrayList arrayList  = new ArrayList();
 *    
 *    creates an empty arraylist...with initial capacity of 10.
 *    
 *    new capacity = (currentCapacity * (3/2))+1; 
 *    
 *    ArrayList arraylist = new ArrayList(int capacity);
 *                      
 *  Linkedlist:
 *   
 *     1.child implementing class of LIst interface
 *     2.underlying data structure is double linked list.
 *     3.Hetergeonous objects are allowed.
 *     4.duplicate object are allowed
 *     5.null possible.
 *     6. best choice to use:
 *         when frequent operation is insertion or deletion.
 *     7.worst choice to use:
 *         when frequent operation is retrieval
 *         
 *     3.Vector:
 *        1. underlying data structure is growable array.
 *        2. I.O is preserved.
 *        3. Duplicate
 *        4. null insertion 
 *        5.Hetergenoue objects are used.
 *        6. all methods of vector are synchronized.
 *        
 *        Vector vector = new Vector();
 *        10
 *        new capactiy  = 2* current capacity;
 *        
 *     
 *     4. Stack;
 *     
 *       1.LIFO
 *       
 *     
 *     
 *     
 *     
 *     
 *     
 * 
 * 
 * */
