/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
package com.project;

public class Pattern04
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			for(int c=1; c<=nR-r+1; c++) System.out.print(c +" ");
			System.out.println();
		}

	}

}
