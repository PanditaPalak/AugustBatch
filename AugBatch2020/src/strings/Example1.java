package strings;
import java.util.Scanner;

//Count occurances of a char in a string
// Teena...e(2)   t  e  e   n   a
public class Example1 {
	Scanner sc = new Scanner(System.in);
	void method()
	{
		
		System.out.println("Enter a string: ");
		String s1  = sc.next();
		
		System.out.println("Enter character to count: ");
		char character = sc.next().charAt(0);
		
		System.out.println("String s1: "+s1);
		int counter =0;
		
		char ch[] = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(character == ch[i])
			{
				counter++ ;
			}
		}
		
		System.out.println("Character "+character+" in string "+s1+" is present at "+counter+ " times.");
	}
	
//First occurance of a string
	//ram is a good boy....boy
	void method1()
	{
		System.out.println("ENter string: ");
		String s1 = sc.nextLine();
		
		System.out.println("ENter word to find: ");
		String s2 = sc.next();
		
		String str[] = s1.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(s2.equals(str[i]))
			{
				System.out.println("Word found at position: "+i);
				break;
			}
		}
		
	}
	//remove all occurances of a character in a string
	void method2()
	{
		System.out.println("ENter a string: ");
		String s1 = sc.nextLine();
		
		char cArray[] = s1.toCharArray();
		
		System.out.println("Enter character to remove: ");
		char ch = sc.next().charAt(0);
		
	
		int cnt=0;
		for(int i=0;i<cArray.length;i++)
		{
			if(cArray[i] == ch)
			{
				cnt++;
			}
			
		}
		//Application p --> Alication
		int size = cArray.length - cnt;
		int k = 0;
		char c1[] = new char[size];
		
		for(int i=0;i<cArray.length;i++)
		{
			if(cArray[i] != ch)
			{
				   c1[k++] = cArray[i];
			}
		}
		System.out.println("After removing char:");
		
		for(char x:c1)
		{
			System.out.print(x);
		}
		
	}
	
	//toggle case
	//PAWAN --> pawan
	//rahul -->RAHUL
	//RaJeSh --> rAjEsH
	
	void method3()
	{
		
		System.out.println("ENter a string: ");
		String s1 = sc.nextLine();
		
		char ch[] =s1.toCharArray();
		
		for(int i =0;i<ch.length;i++)
		{
			if((ch[i] <= 90) && (ch[i] >=65))
					{
				      ch[i] = (char) (ch[i]+32);
					}
			else 
			{
				ch[i] = (char) (ch[i] - 32);
			}
		}
		for(char x: ch)
			System.out.print(x);
	}
	
}







