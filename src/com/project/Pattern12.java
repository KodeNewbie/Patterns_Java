/*
9
7 9
5 7 9
3 5 7 9
1 3 5 7 9
*/
package com.project;

public class Pattern12
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=2*nR-2*r+1;
			for(int c=1; c<=r; c++) 
			{
				System.out.print(i +" ");
				i += 2;
			}
			System.out.println();
		}

	}

}
