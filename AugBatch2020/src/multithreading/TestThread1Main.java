package multithreading;

public class TestThread1Main {

	public static void main(String[] args) {
		
		
		
		TestThread1 t1 = new TestThread1();
		t1.setName("Thread 1");
		System.out.println("Thread 1 priority: "+t1.getPriority());
		System.out.println("Main thread priority: "+Thread.currentThread().getPriority());
		t1.setPriority(10);
		System.out.println("THread 1 priority: "+t1.getPriority());
		
		t1.start();
		
		
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	//************************************	
		
		
		
	}
	
	

}
