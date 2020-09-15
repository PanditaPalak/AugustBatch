package arrays;

import java.util.Scanner;

public class ArraysPassingMethods {
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array: ");
		int size= sc.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter elements of array: ");
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		
		display(array);
		
	}
	
	void display(int array[])
	{
		for(int i: array)
		{
			System.out.println("elements are: "+i);
		}
	}

}
