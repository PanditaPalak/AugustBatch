package exceptions;

public class Test {
	
	
	public  static void main(String[] args)
	{
		int number1,number2,result;
		number1 = 56;
		number2 = 0;
		
		try
		{
			
			System.out.println("statement1");
			System.out.println("statement2");
			
			System.out.println("statement3");
			
		}
		catch(ArithmeticException ai)
		{
			System.out.println("statement 4");
		}
		result = number1/number2;
	}

}
