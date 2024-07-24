/*
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9
*/
package com.project;

public class Pattern16
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		
		for(int r=1; r<=nR; r++)
		{
			int i=r;
			
			for(int c=1; c<=r; c++) 
			{
				System.out.print(i++ + " ");
			}
			System.out.println();
		}

	}

}
