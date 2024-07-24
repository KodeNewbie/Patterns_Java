/*
9 9 9 9 9
7 7 7 7 7
5 5 5 5 5
3 3 3 3 3
1 1 1 1 1
*/
package com.project;

public class Pattern11
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=2*nR-2*r+1;
			for(int c=1; c<=nR; c++) 
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}

	}

}
