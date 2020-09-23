package multithreading;
//Yield
/*
 * if a thread calls yield()
 *   it pauses its execution temporarily to give 
 *   chance to another threads of same priority.
 * if there is no thread or all the waiting threads
 * have low priority then same thread will  get chance to
 * get executed.
 * 
 * */
public class YieldTest extends Thread{

	@Override
	public void run() {
		 
		for(int i=0;i<10;i++)
         {
        	System.out.println(Thread.currentThread().getName()+" getting executed");
        	Thread.yield();
         }
	}
	
}









