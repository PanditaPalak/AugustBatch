package collection;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PDemo {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\BESTBUY\\Desktop\\Data\\Testing1.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println("file has been created");
		
		//d100aDeepa
		
		PrintWriter pw = new PrintWriter(file);
		pw.write(100);
		pw.print(100);
		pw.write('a');
		pw.write("Deepa");
		pw.flush();
		pw.close();
		System.out.println("work done");
	}

}
