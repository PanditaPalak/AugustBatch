package multithreading;

public class Producer extends Thread{
	
	Chocolate ch;
	
	Producer(Chocolate ch)
	{
		this.ch = ch;
	}
	
	
	@Override
	public void run() {
		
		int c = 10;
		int count = 0;
		
		while(count<10)
		{
			ch.produceChocolate(c);
			count++;
		}
		
	}
	

}
