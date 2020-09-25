package multithreading;

public class ChocolateMains {

	public static void main(String[] args) {
		
		Chocolate chocolate = new Chocolate();
		
		Producer producer = new Producer(chocolate);
		producer.start();
		
		Consumer consumer = new Consumer(chocolate, producer);
		consumer.start();

	}

}
