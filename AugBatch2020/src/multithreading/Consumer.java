package multithreading;

public class Consumer extends Thread{
	
	Chocolate ch;
	Producer pr;
	
	public Consumer(Chocolate ch,Producer pr) {
		
		this.ch = ch;
		this.pr = pr;
	}

	
	@Override
	public void run() {
		
		while(true)
		{
			ch.consumeChocolate();
		}
	}
}
