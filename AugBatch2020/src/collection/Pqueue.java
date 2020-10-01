package collection;

import java.util.PriorityQueue;

public class Pqueue {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue(new MyComparator());
		pq.add(87);
		
		for(int i=0;i<5;i++)
		{
			pq.offer(i);
		}
		System.out.println(pq);
	}

}
