package JavaBasic;

public class StringConcatenation1 {

	public static void main(String[] args) {
		//Execution always start from left to right
		//+ is concatenation operator
		//println : this will print on console with new line
		//print: this will just print on console
		
		int a=20;
		int b=30;
		String s="K";
		String s1="T";
		System.out.println(a+b);//50
		System.out.println(s+s1);//KT
		
		System.out.println(a+b+s+s1);//50KT
		System.out.println(s+s1+a+b);//KT2030
		
		System.out.println(a+s+b+s1);//20K30T
		System.out.println(b+s1+a+s);//30T20K
		
		System.out.println(s);//K
		System.out.print(b);
		System.out.println(s1);//30T it will print because we are not using println in above code
		
	}

}
