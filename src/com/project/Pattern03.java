/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/
package com.project;

public class Pattern03 
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=r;
			for(int c=1; c<=r; c++) System.out.print(i-- +" ");
			System.out.println();
		}

	}

}
