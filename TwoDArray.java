package com;

public class TwoDArray {

	public static void main(String[] args) {
		/* Hi The Day 4 Coding  Creating two dimensional arrays Creating Grid lay out */
        int[][] Grid={
        		{0,0,0,0},
        		{0,0,0,0},
        		{0,0,0,0},
        		{0,0,0,0}
        		};
        for(int row=0;row<Grid.length;row++)
        {
        	for(int col=0;col<Grid[row].length;col++)
        	{
        		System.out.print(Grid[row][col]+"\t");
        	}
        	System.out.println();
        }
		/*
		 * // Array without allocation of memory to print null in col String[][]arr=new
		 * String[2][]; System.out.println(arr[0]); //allocation of memory arr[0]=new
		 * String[3]; arr[0][1]="hi the!!"; System.out.println(arr[0][1]);
		 */
	}


}
