/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
package com.project;

public class Pattern05
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=nR;
			for(int c=1; c<=nR+1-r; c++) System.out.print(i-- +" ");
			System.out.println();
		}

	}

}
