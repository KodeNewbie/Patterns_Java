/*

   	 1
     1  2
     1  2  3
     1  2  3  5
     1  2  3  5  8
*/
package com.project;

public class Pattern22
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int first = 1;
			int second = 2;
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
