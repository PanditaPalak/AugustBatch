package exceptions;

import java.io.File;
import java.io.IOException;

public class DemoTest {
	
	
	void method1()
	{
		
		try {
		method2();
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("handled");
	}
	}
	void method2() throws IOException
	{
		method3();
	}
	
	void method3() throws IOException 
	{
		File file = new File("test.txt");
		file.createNewFile();
	}
	
    public static void main(String[] args)
    {
    	DemoTest ob = new DemoTest();
    	ob.method1();
    }
}
