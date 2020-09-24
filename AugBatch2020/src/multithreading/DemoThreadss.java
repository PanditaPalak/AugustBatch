package multithreading;

public class DemoThreadss {

	public static void main(String[] args) {
		
		MessageDisplay md = new MessageDisplay();
		MessageDisplay md1 = new MessageDisplay();
		
		MyThreadClass thread1 = new MyThreadClass(md, "Priya");
		MyThreadClass thread2 = new MyThreadClass(md1, "Rahul");
		MyThreadClass thread3 = new MyThreadClass(md1, "Sonia");
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
