package multithreading;

class Testing extends Thread{
	
}

public class DaemonThreadDemo {
	
	public static void main(String[] args)
	{
		System.out.println("Main: "+Thread.currentThread().isDaemon());
		Testing t1 = new Testing();
		System.out.println("t1 is daemon: "+t1.isDaemon());
		
//		t1.setDaemon(true);
//		System.out.println("t1 is daemon: "+t1.isDaemon());
//	
		t1.start();
		
	}

}
