package JavaBasic;

public class IfElseConcept2 {

	public static void main(String[] args) {
		//all keywords will start with small letters
		//if is a keyword
		//c=d means we are assigning value of d into c
		//c==d means we are comparing c and d values
		//Comparison operator: < > <= >= == !=
		
		int a=110;
		int b=20;
		int c=40;
		int d=50;
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
		if(c==d)
		{
			System.out.println("c and d both are equal");
		}
		else
		{
			System.out.println("c and d are not equal");
		}
		
		//find highest number out of 3 numbers
		//nested if else
		int e=1100;
		int f=1200;
		int g=300;
		
		if(e>f & e>g)
		{
			System.out.println(e+" Is greater than "+f+" and "+g);
		}
		else if(f>g)
		{
			System.out.println(f+" Is greater than "+e+" and "+g);
		}
		else
		{
			System.out.println(g+" Is greater than "+e+" and "+f);
		}

	}

}
