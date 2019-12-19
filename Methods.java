package com;
class Robot{
	public void speak(String text)
	{
		System.out.println(text);
	}
	public void Move(String dire,int distance)
	{
		System.out.println("Move:\t"+dire+" for " +distance+ " metres and turn right");
	}
}
public class Methods {

	public static void main(String[] args) {
		//creating Robot Object
		Robot ro=new Robot();
		// calling all the methods.
		ro.speak("Hi Ntoki");
		ro.Move("west", 7);

	}

}
