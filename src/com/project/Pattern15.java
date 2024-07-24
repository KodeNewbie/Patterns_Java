/*
1
11
101
1001
*/
package com.project;

public class Pattern15
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			for(int c=1; c<=r; c++) 
			{
				if(c==1 || r==c) System.out.print(1);
				else System.out.print(0);
			}
			System.out.println();
		}

	}

}
