package interfaces;

public class AxisB implements Bank{

	@Override
	public void rateOfInterest() {
		System.out.println("8.9 by axis");
		
	}

	
	@Override
	public void policy() {
		System.out.println("Redefining policy");
	
	}
}
