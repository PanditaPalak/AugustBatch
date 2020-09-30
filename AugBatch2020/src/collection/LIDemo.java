package collection;

import java.util.LinkedList;
import java.util.ListIterator;

//list iterator --> child interface of iterator
public class LIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new  LinkedList();
		l.add("ram");
		l.add("suhani");
		l.add("priya");
		l.add("mayuri");
		l.add("vivek");
		l.add("vian");
		
		System.out.println("1: "+l);
		
		ListIterator li = l.listIterator();
		while(li.hasNext())
		{
			String s = (String) li.next();
			
			if(s.equals("suhani"))
			{
				li.add("rakesh");
				System.out.println("2: "+l);
				
			}
			else if(s.equals("priya"))
			{
				li.remove();
				System.out.println("3: "+l);
			}
			else if(s.equals("vivek"))
			{
				li.set("SOnali");
				System.out.println("4: "+l);
			}
			else
			{
				//li.add("AKash");
				System.out.println("5: "+l);
			}
			
		}
		System.out.println("final : "+l);

	}

}
