/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
package com.project;

public class Pattern02 
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=nR+1-r;
			for(int c=1; c<=nR+1-r; c++) System.out.print(i-- +" ");
			System.out.println();
		}

	}

}
