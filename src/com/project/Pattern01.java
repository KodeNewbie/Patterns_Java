/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
package com.project;

public class Pattern01 
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			for(int c=1; c<=r; c++) System.out.print(r+" ");
			System.out.println();
		}

	}

}
