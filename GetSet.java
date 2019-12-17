package com;
 class person1
{
	//instance variable
	int age;
	String name;
	//methods or behavior of the class
	void speak() 
	{
		System.out.println("my name is:"+name);
	}
	int calcRAge() 
	{
		int yearsLeft=65-age;
		return yearsLeft;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
}
public class GetSet {

	public static void main(String[] args) {
		//
		
		person1 nto=new person1();
		nto.name="Ntokozo";
		nto.age=16;
		//nto.speak();
		/*
		 * int years=nto.calcRAge(); System.out.println("You Age My Age:"+years);
		 */
		String name=nto.getName();
		int age=nto.getAge();
		System.out.println("My Name is: "+name+"\n"+"My Years Left:"+age);
	}

}
