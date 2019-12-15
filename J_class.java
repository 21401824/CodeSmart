class person{
	//Instance variables 
	int age;
	String name;
	
	//1.data
	//2.subroutine(Methods/ behavior )
	void speak()
	{
		System.out.println("My Name is:"+name+" i am :"+age+" years old.");
	}
	void sayHi()
	{
		System.out.println("Hi there:");
	}
}
public class J_class {

	public static void main(String[] args)
	{
		person p1=new person();
		p1.name="Mfundo";
		p1.age=25;
		p1.sayHi();
		p1.speak();
		person p2=new person();
		p2.age=16;
		p2.name="Nontando";
		p2.speak();
	}
}
