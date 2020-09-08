package exceptions;

import java.util.Scanner;

public class TestingEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		try {
			 result = num1 / num2;//A.E ae
			// result = 45/0;
			//risky code
		}
		
		catch (ArithmeticException arithmeticObject) {
			System.out.println("Infinite");
			//handling code
		}
		
		System.out.println("Result is: "+result);
		
		
		
	}

}
