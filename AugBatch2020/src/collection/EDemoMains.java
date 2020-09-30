package collection;

import java.util.ArrayList;
import java.util.Iterator;

//iterator -- 3 methods
public class EDemoMains {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		for(int i=0;i<5;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		Iterator i = al.iterator();
		while(i.hasNext())
		{
            Integer in = (Integer) i.next();
			
			if(in % 2 == 0)
			{
				System.out.println(in+" is even");
			}
			else
			{
				i.remove();
			}
		}
		System.out.println(al);
		

	}

}
