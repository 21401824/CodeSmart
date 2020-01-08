package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reading_File {

	public static void main(String[] args) throws FileNotFoundException {
		String r_file="NgweYam.txt";
		
		File read=new File(r_file);
		
		Scanner reader=new Scanner(read);
		
		int value= reader.nextInt();
		System.out.println("My First Var:"+value);
		reader.nextLine();
		int count=0;
		//for(int i=0;i<read.length();i++)
		while(reader.hasNext())
		{
			String lineByline=reader.nextLine();
			count++;
			System.out.println(count+":"+lineByline);
			reader.nextLine();
		}
		if(read !=null)
		{
			reader.close();
		}
	}

}
