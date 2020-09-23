package multithreading;

public class JoinTestMains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		JoinTest thread1 = new JoinTest();
		thread1.setName("Thread1 ");
		thread1.start();
		thread1.join();

		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" getting executed");
			
		}

	}

}
