package multithreading;
//Preventing threads from execution
//1. sleep()
public class MTest  extends Thread{

	@Override
	public void run() {
		 try {
		         for(int i=0;i<10;i++)
		             {
		            	System.out.println(Thread.currentThread().getName()+" getting executed");
		            	Thread.sleep(3000);
			         }
		      }
		         catch (InterruptedException e) 
		      {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		}
	
	
	
}
