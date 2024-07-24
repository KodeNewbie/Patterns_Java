/*
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
*/
package com.project;

public class Pattern20
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=2*r-1;
			
			for(int c=1; c<=r; c++) 
			{
				System.out.print(i +" ");
				i -= 2;
			}
			
			System.out.println();
		}

	}

}
