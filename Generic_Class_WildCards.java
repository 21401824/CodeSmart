package com.amapara;

import java.util.ArrayList;

class Machine{

	@Override
	public String toString() {
		return "I am a Machine";
	}
	public void start(){
		System.out.println("Machine Starting");
	}
}
class camera extends Machine{

	@Override
	public String toString() {
		return "i am a camera";
	}
	public void snap(){
		System.out.println("Take Ntokozo a snap");
	}
}

public class Generic_Class_WildCards {
	public static void main(String[] args) {
	ArrayList<Machine>list1=new ArrayList<Machine>();
	ArrayList<camera>list2=new ArrayList<camera>();
	list1.add(new Machine());
	list2.add(new camera());
	
	showList(list2);
	showList(list1);
	}
	// Upper Bound
	public static void showList(ArrayList<? extends Machine>li)
	{
		for (Machine s : li) {
			System.out.println(s);
			s.start();
		}
	}
	// her you can only pass parameters of camera superiors
		public static void showList2(ArrayList<? super camera>li)
		{
			for (Object s : li) {
				System.out.println(s);
				//this wont work you have to down cast for it to work (s.start());
			}
		}

}
