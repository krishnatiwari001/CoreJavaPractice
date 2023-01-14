package JavaBasic;

public class IfElseConcept_3 {

	public static void main(String[] args) {
		//all keywords will start with small letters
		//if is a keyword
		//if c=d means you are assigning value of d to c
		//if c==d means you are comparing c with d
		//comparison operator: <, >, <=, >=, !=, ==
		
		int a=20;
		int b=30;
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else
		{
			System.out.println(b+" is greater than "+ a);
		}
		
		int c=40;
		int d=40;
		if(c>d)
		{
			System.out.println(c+" and "+d+" are equal");
		}
		else
		{
			System.out.println(c+" and "+d+" are not equal");
		}
		
		//find highest number out of 3 numbers
		//nested if else
		int e=80;
		int f=90;
		int g=70;
		if(e>f && e>g)
		{
			System.out.println(e+" is greatest number");
		}
		else if(f>g)
		{
			System.out.println(f+" is greatest number");
		}
		else
		{
			System.out.println(g+" is greatest number");
		}
	}

}
