package exceptions;

import java.util.Scanner;

public class MethodsEx {
	
	void method1()
	{
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		int result=0;
		try {	
			
			result = num1 / num2;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Infinite");
		}
		System.out.println("Result is: "+result);	
		System.out.println("in method1");
	}
	
	void method2()
	{
		
		method1();
		System.out.println("in method2");
	}
	
	void method3()
	{
		
		method2();
		System.out.println("in method3");
	}
	
	void method4()
	{
	
		method3();
		System.out.println("in method4");
	}

}
