package multithreading;

public class JoinTest extends Thread{

	@Override
	public void run() {
		 try { 
		for(int i=0;i<5;i++)
         {
        	System.out.println(Thread.currentThread().getName()+" getting executed");
       
			Thread.sleep(2000);
		} }catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         }

}
