/*
 	   1   2   3
       6   5   4
       7   8   9
      12  11  10
      13  14  15
*/
package com.project;

public class Pattern21
{
	public static void main(String[] args) 
	{
		int nR = 5;
		int i=1;
		
		for(int r=1; r<=nR; r++)
		{
			
			if(r%2==0) {
			for(int c=1; c<=3; c++) 
			{
				System.out.print(i-- +" ");
			} 
			i += 4;}
			
			if(r%2!=0) {
			for(int c=1; c<=3; c++)
			{
				System.out.print(i++ + " ");
			} i += 2;
			}
			
			System.out.println();
		}

	}

}
