/*
    1
   21
  321
 4321
54321
*/
package com.project;

public class Pattern18
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=r;
			
			for(int c=1; c<=nR; c++) 
			{
				if(c<=nR-r) System.out.print("  ");
				else System.out.print(i-- +" ");
			}
			System.out.println();
		}

	}

}
