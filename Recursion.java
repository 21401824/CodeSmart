package com.amapara;

public class Recursion {
public static void main(String[]args)
{
	System.out.println(factoria(4));
}
public static int factoria(int value)
{
if(value==1)
{
return 1;
}
return factoria(value-1)*value;
}
}
