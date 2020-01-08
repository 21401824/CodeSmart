package com;
class Machine{
	public void start()
	{
		System.out.println("Machine starting....");
	}
}
interface human{
	public void behave();
};
public class Anonimus {

	public static void main(String[] args) {
		Machine m1=new Machine()
		{
			@Override
			public void start()
			{
				System.out.println("Camera Snaping");
			}
		};
		m1.start();
		human h1=new human() {
			@Override
			public void behave()
			{
				System.out.println("Cough");
			}
			
		};
		h1.behave();
	}

}
