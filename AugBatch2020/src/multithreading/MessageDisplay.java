package multithreading;

public class MessageDisplay {
	
	public synchronized void message(String name)
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(name+" says Good Morning!!!");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}

}
