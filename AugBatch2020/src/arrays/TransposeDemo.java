package arrays;

import java.util.Scanner;

public class TransposeDemo {
	
Scanner sc = new Scanner(System.in);
	
	void input()
	{
		int size;
		System.out.println("Enter size: ");
		size = sc.nextInt();
		
		int array[][] = new int[size][size];
		
		System.out.println("Enter elements: ");
		
		for(int row =0;row<size;row++)
		{
			for(int col =0;col<size;col++)
			{
				array[row][col] = sc.nextInt();
			}
		}

		transpose(array, size);
	}
	
	void transpose(int array[][],int size)
	{
		int matrix2[][] = new int[size][size];
		for(int row =0;row<size;row++)
		{
		for(int col =0;col<size;col++)
		{
		   matrix2[row][col] = array[col][row]; 
		}
		}
		display(matrix2, size);
	}
	
	
	void display(int matrix2[][],int size)
	{
		System.out.println("The matrix is : ");
		for(int row =0;row<size;row++)
		{
			for(int col =0;col<size;col++)
			{
				System.out.print(" "+matrix2[row][col]);
			}
			System.out.println();
		}
	}



}
