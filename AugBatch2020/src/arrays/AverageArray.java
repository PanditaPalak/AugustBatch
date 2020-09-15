package arrays;

import java.util.Scanner;

public class AverageArray {
	
	
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
		
		average(array);
		
	}
	
	
	void average(int array[])
	{
		
		int sum = 0;
		for(int i=0;i<array.length;i++)
		{
			
			sum = sum + array[i];	
			
		}
		int average = sum/array.length;
		display(array, sum, average);
	}
	
	
	void display(int array[],int sum,int average)
	{
		for(int i: array)
		{
			System.out.println("elements are: "+i);
		}
		
		System.out.println("Sum of elements : "+sum);
		System.out.println("Average of elements : "+average);
	}

	
	

}
