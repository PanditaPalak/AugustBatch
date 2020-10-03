package collection;

import java.util.Comparator;

public class MyComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		 Integer i1 = (Integer) o1;
		 Integer i2 = (Integer) o2;
		 
		 if(i1<i2)
		 {
			 return +1;
		 }
		 else if(i1>i2)
		 {
			 return -1;
		 }
		 else {
		
		return 0;
	}}

}

//// 10 5 15 20 0
//
// compare(10,5) --> 10,5
// compare(15,10)-->15 10 5
// comapre(20,15) --> 20,15,10,5
// compare(0,20)--
// com(0,15)
// com(0,10)
// com(0,5)-->20,15,10,5,0