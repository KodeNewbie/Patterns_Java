/*
   1
   2   3
   4   5   6
   7   8   9  10
  11  12  13  14  15
*/
package com.project;

public class Pattern14
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		int i=1;
		
		for(int r=1; r<=nR; r++)
		{
			for(int c=1; c<=r; c++) 
			{
				System.out.printf("%4d",i++);
			}
			System.out.println();
		}

	}

}
