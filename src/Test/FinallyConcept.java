package Test;

public class FinallyConcept {

	public static void main(String[] args) {
		//finally is a block
		//finally is a block no need to write any method for this
		//we can not write finally without try catch block
		//finally will execute always after try catch block
		//test();
		test2();
		division();
		division1();
	}
	
	public static void test()
	{
		try 
		{
		System.out.println("inside test1 method ");	
		throw new RuntimeException("test");//here we can pass any string
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally block");
		}
	}
		//
	//finally will execute always if exception will not throw then also
		public static void test2()
		{
			try
			{
				System.out.println("Test2 method");
			}
			finally
			{
			System.out.println("Test2 code");
			}
		}
		//finally will execute even exception is present in catch block
		public static void division()
		{
			try {
			int i=10;
			System.out.println("inside try block");
			int k=i/0;
			System.out.println(k);
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("inside catch block");
				System.out.println("divide by zero exception");
			}
			finally
			{
				System.out.println("Excute this code even after any exception");
			}
		}
		//finally will execute even exception is not present in catch block
		public static void division1()
		{
			try 
			{
			int i=90;
			System.out.println("This is try block");
			int k=i/0;
			System.out.println(k);
			}
			
			catch(NullPointerException e)
			{
				System.out.println("Inside catch block");
				System.out.println("Divide by zero exception");
			}
			
			finally
			{
				System.out.println("Execute this code even exception is not present inside catch block");
			}
		}
	}


