package arrays;

import java.util.Scanner;

public class BinarySearch {
	
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
	    
	  binarySearch(array,search);
	
	  
	
	}
	
	void binarySearch(int array[],int search)
	{
		
		int first =0;
		int last = array.length -1;
		int mid = (first+last)/2;
		
		while(first <= last)
		{
			
			if(array[mid] < search)
			{
				first = mid+1;
			}
			
			else if(array[mid] == search)
			{
				System.out.println(search+" is found at index: "+mid);
			    break;
			
			}
			else
			{
				last = mid -1;
			}
			mid =(first+last)/2;
		}
		
		if(first > last)
		{
			System.out.println("element not found");
		}
	}

}









