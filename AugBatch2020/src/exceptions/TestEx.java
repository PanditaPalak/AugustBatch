package exceptions;

import java.io.File;
import java.io.IOException;

public class TestEx {
	
	
	
	public static void main(String[] args)
	{
		File file1 = new File("Test.txt");
		try 
		{
			file1.createNewFile();
		} 
		catch (IOException e) {
			System.out.println("IO Exception...");
		}
		
	}
	

}
