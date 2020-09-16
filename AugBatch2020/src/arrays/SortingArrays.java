package arrays;

import java.util.Scanner;

public class SortingArrays {
	//Bubble sort
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		int size ;
		System.out.println("Enter size of array: ");
		size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter elements of array: ");
	
	    for(int i = 0; i<array.length; i++)
	    {
	    	array[i] = sc.nextInt();
	    }
	  bubbleSort(array);
	}
	
	void bubbleSort(int array[])
	{
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			}
		}
		
		for(int i : array)
		{
			System.out.print("  "+i);
		}
	}
	

}
