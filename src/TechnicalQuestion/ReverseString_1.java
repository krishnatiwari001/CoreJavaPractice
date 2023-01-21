package TechnicalQuestion;

public class ReverseString_1 {
	public static void main(String [] args)
	{
		//first method
	String name = "Krishna";
	char chars[] = name.toCharArray();
	for(int i=chars.length-1; i>=0; i--)
	{
		System.out.print(chars[i]);
	}

	//second method
	System.out.println();
	System.out.println("Second method");
	String Lname = "Tiwari";
	String token[] = Lname.split("");
	for(int j=token.length-1;j>=0;j--)
	{
		System.out.print(token[j]+"");
	}
	}

}
