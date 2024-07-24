/*
    1
   12
  123
 1234
12345
*/
package com.project;

public class Pattern17
{
	public static void main(String[] args) 
	{
		int nR = 5;
		
		for(int r=1; r<=nR; r++)
		{
			int i=1;
			
			for(int c=1; c<=nR; c++) 
			{
				if(c<=nR-r) System.out.print("  ");
				else System.out.print(i++ +" ");
			}
			System.out.println();
		}

	}

}
