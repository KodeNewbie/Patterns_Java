/*
3
44
555
6666
77777
*/
package com.project;

public class Pattern10
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=2+r;
			for(int c=1; c<=r; c++) 
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}

	}

}
