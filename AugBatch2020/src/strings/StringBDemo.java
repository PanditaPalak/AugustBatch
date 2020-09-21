package strings;

public class StringBDemo {
	
	void method() {
	
	StringBuffer sb = new StringBuffer("Java is a ");
	//System.out.println(sb);
	
	sb.append("programming language");
	System.out.println(sb);
	
	sb.insert(3, "***");
	System.out.println(sb);
	
	
	StringBuilder sb2 = new StringBuilder();
	
//	sb.delete(1, 5);
//	System.out.println(sb);
	
	//sb.delete(1, 5);
//	System.out.println(sb);
//	StringBuffer sb1 = new StringBuffer();
//	System.out.println(sb1.capacity());//16
//	
//	sb1.append("java");
//	System.out.println(sb1.capacity());
//	
//	sb1.append("is a programming language...");
//	System.out.println(sb1.capacity());
	
	// (old capacity * 2)+2;
	//(16*2)+2 = 34;
   
	
	}
	

}

/*StringBuffer
 *   Mutable--modifiable/changeable
 *   StringBuffer sb = new StringBuffer();
	//creates an empty stringbuffer object with 
	//initial capacity of 16.
	
	StringBuffer sb1  = new StringBuffer("Rahul Rajput");
	
	StringBuffer sb2 = new StringBuffer(20);
 *      
 * 
 * 
 
 * 
 * 
 * 
 */