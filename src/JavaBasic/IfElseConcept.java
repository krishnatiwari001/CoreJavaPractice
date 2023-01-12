package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		//all keywords in java will start with small letters
		//if is a keyword in java
		//if c=d means you are assigning value of d into c
		//if c==d means you are comparing value of c with d
		//comparison operators: <, >, <=, >=, ==, !=
		
		int a=10;
		int b=20;
		
		if(a>b)
		{
			System.out.println(a+ "is greater than" +b);
		}
		else
		{
			System.out.println(b +"is greater than" +a);
		}
		
		int c=40;
		int d=40;
		if(c==d)
		{
			System.out.println(c+ "and" +d+ "are equal");
		}
		else
		{
			System.out.println(c+ "and" +d+ "are not equal");
		}
		//using nested if else find greatest number out of 3 numbers
		int e=190;
		int f=1100;
		int g=120;
		
		if(e>f & e>g)
		{
			System.out.println(e+" "+"is greatest number");
		}
		else if(f>g)
		{
			System.out.println(f+" "+"is greatest number");
		}
		else
		{
			System.out.println(g+" "+"is greatest number");
		}
	}

}
