package arrays;

import java.util.Scanner;

public class OperationsOnArrays {
	
	//Searching -->Linear Search,Binary Search
	
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
	    
	    System.out.println("Enter searching element: ");
	    int search = sc.nextInt();
	    
	  int index =  linearSearch(array,search);
	  display(array, search, index);
	  
	
	}
	
	
	int linearSearch(int array[],int search)
	{
		
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == search)
			{
				return i;
			}
			    
		}
		return -1;
		
	}
	
	void display(int array[],int search,int index)
	{
		System.out.println("Elements in the array are: ");
		for(int i : array)
		{
			System.out.println(i);
		}
		
		if(index >0) 
		{
		System.out.println("The " +search+" is found at index: "+index);
		}
		else
		{
			System.out.println("Sorry element is not present int he list.");
		}
	}
	

}


 //8   6    3    2   1
//int search = 18













