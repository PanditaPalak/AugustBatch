package multithreading;

public class Chocolate {
	
	int chocolate = 0;
	
synchronized void produceChocolate(int numberOfChocolate)
	{
		//**** waiting code**********
		if(chocolate >= 20)
		{
			try {
				System.out.println("Producer Thread is waiting...");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	//*** sleeping code***************	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//*** production code************	
		chocolate = chocolate + numberOfChocolate;
		System.out.println("Chocolate Produced: "+chocolate);
		notify();
		
		
	}
	
//******************************************************	
synchronized void consumeChocolate()
	{
		
		if(chocolate<20)
		{
			System.out.println("Consumer is waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//*** consumption code
		while(chocolate > 7)
		{
			chocolate = chocolate -7;
			System.out.println("Remaining choclates after consuming is : "+chocolate);
		}
		notify();
		
	}

}
