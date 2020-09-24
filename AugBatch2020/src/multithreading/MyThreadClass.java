package multithreading;

public class MyThreadClass  extends Thread{
	
	
	MessageDisplay md;
	String name;
	
	MyThreadClass(MessageDisplay md,String name)
	{
		this.md = md;
		this.name=name;
	}
	
	
	@Override
	public void run() {
		
		md.message(name);
	}
	
	

}
