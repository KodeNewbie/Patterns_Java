/*
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
*/
package com.project;

public class Pattern06
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=1;
			for(int c=1; c<=nR+1-r; c++) 
			{
				System.out.print(i +" ");
				i += 2;
			}
			System.out.println();
		}

	}

}
