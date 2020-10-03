package collection;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\BESTBUY\\Desktop\\Data\\Testing.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println("file has been created");
		
		FileWriter fw = new FileWriter(file);
		fw.write('1');
		fw.write('a');
		fw.write('p');
		fw.write('o');
		fw.write('r');
		fw.flush();
		System.out.println("work done");
		
		FileReader fr = new FileReader(file);
		char ch[] = new char[(int) file.length()];
		fr.read(ch);
		for(char c: ch)
		{
			System.out.println(c);
		}
	}

}
