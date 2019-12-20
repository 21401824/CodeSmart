package com;
class frog{
	private int age;
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}
public class SettersAndThis {

	public static void main(String[] args) {
		// creating frog class object to call its attributes and methods
		frog fro=new frog();
				fro.setName("Ntoki");
				fro.setAge(16);
				System.out.println("My Age:"+fro.getAge()+"My Name:"+fro.getName());
       
	}

}
