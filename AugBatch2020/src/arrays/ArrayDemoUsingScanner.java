package arrays;

import java.util.Scanner;

public class ArrayDemoUsingScanner {
	
	public static void main(String[] args)
	{
		
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		size = sc.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter elements of array: ");
		for(int i = 0; i<array.length;i++)
		{
			array[i] = sc.nextInt();
			
		}
		
//		for(int  i = 0;i<array.length;i++)
//		{
//			System.out.println("Elements of array are: "+array[i]);
//		}
	
		for(int i : array)
		{
			System.out.println("ELEMENTS OF ARRAY ARE: "+i);
		}
	
	}

}
