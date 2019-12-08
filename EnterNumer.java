package com.school;

import java.util.Scanner;

public class EnterNumer {

	public static void main(String[] args) {
		//Accepting Input From The user using scanner until the value using while loop:
        //Creating Scanner variable
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Numer:");
		int value=s.nextInt();
		while(value!=5)
		{
			System.out.println("Enter a Numer:");
		    value=s.nextInt();	
		}
		System.err.println("Got !5");
	}

}
