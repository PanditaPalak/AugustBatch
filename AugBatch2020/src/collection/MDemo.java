package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class MDemo {

	public static void main(String[] args) {
		TreeMap h = new TreeMap();
		h.put(9, "Priya");
		h.put(2, 100);
		h.put(4, "Pratiksha");
		h.put(3, "Shubham");
		h.put(7, "Dipti");
		h.put(1, "Santoshi");
		System.out.println(h);
		
		System.out.println(h.headMap(4));
		System.out.println(h.tailMap(2));
		System.out.println(h.subMap(2, 7));
		
		}

}
/*
 * key value pairs are stored in Map.
 * Methods:
 *  put(key,value);
 *  putAll(map2);
 *  clear();
 *  containsKey(key);
 *  containsValue(value);
 *  get(key);
 *  
 *  HashMap
 *  d.s --> hastable
 *  heteregenous objeccts are allowed for both keys and 
 *  values
 *  duplicate keys are not allowed
 *  values can be duplicate
 *  null key is not allowed
 *  null values are allowed
 *  
 *  1=Santoshi,  (entry)
 *  2=Rahul, 
 *  3=Shubham, 
 *  4=Pratiksha, 
 *  7=Dipti, 
 *  9=Priya
 *  
 *  LinkedHashMap
 *  child class of HashMap
HashMap h = new HashMap();
		;
		
		
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.containsKey(3));
		System.out.println(h.containsValue("Dipti"));
	

   SortedMap
   child interface of Map
   sorting order
   sorting --> keys
   
   methods:
   firstKey()
   lastKey()
   
   TreeMap
 * 
 */