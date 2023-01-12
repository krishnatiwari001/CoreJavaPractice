package JavaBasic;

public class IfElseConcept1 {

	public static void main(String[] args) {
		//All keywords in java will start with small letters
		//if is a keyword
		//if c=d  means you are assigning value of d into c
		//c==d means you are comparing value of c with d
		//Comparison operators: <, >, <=, >=, ==, !=
		int a=10;
		int b=20;
		if(a>b)
		{
			System.out.println(a +" " + "is greater than " + b);
		}
		else
		{
			System.out.println(b +" "+ "is greater than " + a);
		}
		
		//write logic to find find greatest number out of 3 numbers
		int c=130;
		int d=140;
		int e=50;
		if(c>d & c>e)
		{
			System.out.println(c +" "+ "is greatest number");
		}
		else if(d>e)
		{
			System.out.println(d +" "+ "is greatest number");
		}
		else
		{
			System.out.println(e +" "+ "is greatest number");
		}
	}

}
