package Test;

public class ChileClass extends ParentClass {
	//this is called method overriding
	//if you want to prevent inheritance you have to declare parent class as final
	//if you want to prevent overriding you have to declare method as final
	public void start()
	{
		System.out.println("child---------start method");
	}

}
