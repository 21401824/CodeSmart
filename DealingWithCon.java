package com;
class con{
	String name;
	private int code;
	
	public con() {
		//calling a parameterized constructor in default constructor
		this("Mfundo",8);
		System.out.println("First Con Running");	
	}
	public con(String name)
	{
		// Calling a constructor that has two parameters in a constructor that has 1
		this(name,9);
		this.name=name;
		System.out.println("Second Con Running");
	}
	public con(String name,int code)
	{
		this.name=name;
		this.code=code;
	}
}
public class DealingWithCon {

	public static void main(String[] args) {
		con c1=new con();
		con c2=new con();
		con c3=new con();

	}

}
