package collection;

import java.util.LinkedList;
import java.util.Stack;

public class Demo {

	
	public static void main(String[] args)
			{    
		
		Stack s = new Stack();
		s.push(76);
		s.push(788);
		s.push(122);
		s.push(12);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(122));
		
		
		
		
//	           LinkedList l = new LinkedList();
//	           l.add("Ram");
//	           l.add(888);
//	           l.add(23.55);
//	           l.add('A');
//	           l.add(100);
//	           System.out.println(l);
//	           l.add(2,"Priya");
//	           System.out.println("1: "+l);
//	           
//	           LinkedList l1 = new LinkedList();
//	           l1.add(1000);
//	           l1.add(2000);
//	           
//	           l.addAll(4,l1);
//	           System.out.println(l);
//	           
//	           l.remove(2);
//	           System.out.println(l);
//	           
//	           l.addFirst(67);
//	           System.out.println(l);
	           
//	           l.addLast(78);
//	           System.out.println(l);
//	           
//	           l.add(65555);
//	           System.out.println(l);
	        //   l.clear();
	          // System.out.println(l);
	           
			}
	           
	        		   
}
//underlying data st is double linked list
//duplicate objects are allowed
//hetergenous objects are allowed
//null insertion is possible

/* vector
 * 
 * add()
 * add(index)
 * addElement(Object ob)
 * removeElement()
 * removeElementAt(int index)
 * removeAllElements()
 * 
 * get(int index)
 * elementAt(index)
 * firstElement()
 * lastElement()
 * 
 * Vector v = new Vector();
 * 
 * initial capacity is 10;
 * 2 * old capacity;
 * 
 * 
 * 
 * arraylist al = new arraylist();
 * al.capacity()---> 10
 * (current cap. *3/2)+1;
 * 30/2
 * 15+1=16
 * 
 * 48/2
 * 24+1 = 25
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 