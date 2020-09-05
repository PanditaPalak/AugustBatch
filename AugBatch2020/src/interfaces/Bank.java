package interfaces;

public interface Bank {
	
	void rateOfInterest();
	
	default void policy()
	{
		
	}
	
	static void display()
	{
		System.out.println("displaying data");
	}

}
