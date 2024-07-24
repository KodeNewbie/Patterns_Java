/*
9
9 7
9 7 5
9 7 5 3
9 7 5 3 1
*/
package com.project;

public class Pattern13
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=2*nR-1;
			for(int c=1; c<=r; c++) 
			{
				System.out.print(i +" ");
				i -= 2;
			}
			System.out.println();
		}

	}

}
