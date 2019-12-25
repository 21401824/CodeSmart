package com;

class thing {
	public String name;
	public static String description;
	public static int count=0;
	int id;
	public thing()
	{
		id=count;
		count++;
	}
	//Declaring a static final variable, assigning it since we cannot re assign it.
    public final static int LUCKY_NUMBER=16;
	public void showName() {
		System.out.println(name);
		//using static variable in instant method
		System.out.println("Object id is: "+id+" ,"+description+":"+name+ " and have:"+LUCKY_NUMBER+" Years Old");
	}

	public static void showInfo() {
		System.out.println(description);
		// this wont work System.out.println(name);
	}
}

public class Working_with_staticV {

	public static void main(String[] args) {

		System.out.println("Before Creating Object i am:"+thing.count);
		thing t1=new thing();
		thing t2=new thing();
		System.out.println("After Creating Object I am:"+thing.count);
		thing.description = "i am IKholwa Lakwamoya";
		t1.name="Ntokozo";
		t2.name="Mfundo";
		
		t1.showName();
		t2.showName();
		thing.showInfo();
		System.out.println(thing.LUCKY_NUMBER);
	}

}
