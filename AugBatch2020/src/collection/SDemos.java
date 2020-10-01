package collection;

import java.util.Comparator;
import java.util.TreeSet;

//Sorted Set
public class SDemos {
	
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(500);
		ts.add(12);
		ts.add(900);
		ts.add(23);
		ts.add(120);
		ts.add(9);
		ts.add(263);
		System.out.println(ts);
	}

	
}

/*
 * Sorted Set
 * 
 * 1. representing a group of objects where duplicates are not 
 * allowed.
 * 2.Insertion order is not preserved .
 *   insertion is being done on some sorting order.
 *      Sorting order  may be Default Natural sorting order
 *      (DNSO).
 *      Customized sorting order.
 *      
 *      [100,120,130,140,150,160]
 *       Methods:
 *          first() --  100
 *          last()  --  160
 *          headSet(object obj) -- 
 *          headSet(150) -- [100,120,130,140]
 *          tailSet(130) -- [130,140,150,160]
 *          subSet(ob1,ob2)
 *          subSet(130,150)-- [130,140]
 *          comparator() -- null
 *          
 *   TreeSet
 *   
 *    1.Underlying data set is balanced tree
 *    2.Duplicate objects are not allowed
 *    3.Insertion order is not preserved.
 *    4.Hetergeneous objects are not allowed.
 *    
 *    [10,5,15,20,0]
 *    
 *    ob1 ob2
 *    10 , 5  -->  10 5
 *    15 ,10  -->  15  10  5
 *    20,15   ---> 20 15  10 5
 *    0, 20  -->  
 *    0,15
 *    0,10
 *    0,5 ---> 20,15,10,5,0
 *    
 *   20    
 *      15
 *          10
 *              5
 *           0   
 *           
 *           20
 *         15
 *       10
 *      5
 *         
   Queue
   1. child interface of collection.
   
   2.   to represent a group of objects prior to processing
      go for queue     
 *  3. FIFO technique.
 *  4.  methods
 *      offer(obj);
 *      peek(); -->empty--null
 *      element();-->empty -- exception
 *      poll();-->empytyy --null
 *      remove(); --> emptyy --> nosuchelementexption
 *              
 *              
 * 
 */










