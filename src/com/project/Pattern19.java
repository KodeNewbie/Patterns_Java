/*
   1
  31
 531
7531
*/
package com.project;

public class Pattern19
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=2*r-1;
			
			for(int c=1; c<=nR; c++) 
			{
				if(c<=nR-r) System.out.print("  ");
				else 
				{
					System.out.print(i +" ");
					i -= 2;
				}
			}
			System.out.println();
		}

	}

}
