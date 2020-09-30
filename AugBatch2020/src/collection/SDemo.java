package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

//insertion order is not preserved....
//duplicate objects are not allowed
/*
 * hash set:
 *  
 *  insertion order is based on object
 *  data st.--hash table.
 *  duplicate objects not allowed
 *  null is possible
 *  heterogeneous objects are allowed.
 *  best --? searching
 * 
 * */
public class SDemo {
	
	public static void main(String[] args)
	{
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(450);
		hs.add(800);
		hs.add(230);
		hs.add(null);
		hs.add(650);
		hs.add(110);
		hs.add(88);
		System.out.println(hs);
	}

}
