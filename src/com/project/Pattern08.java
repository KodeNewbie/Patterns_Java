/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
*/
package com.project;

public class Pattern08
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=r;
			for(int c=1; c<=nR-r+1; c++) 
			{
				System.out.print(i++ +" ");
			}
			System.out.println();
		}

	}

}
