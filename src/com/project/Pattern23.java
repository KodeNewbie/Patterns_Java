/*

     0
     0  1
     0  1  1
     0  1  1  2
     0  1  1  2   3
*/
package com.project;

public class Pattern23
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int first = 0;
			int second = 1;
			int next;
			
			for(int c=1; c<=r; c++) 
			{
				System.out.print(first + " ");
				next = first + second;
				first = second;
				second = next;
			}
			
			System.out.println();
		}

	}

}
