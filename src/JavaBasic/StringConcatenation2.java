package JavaBasic;

public class StringConcatenation2 {

	public static void main(String[] args) {
		//Execution always start from left to right
		//+ is called concatenation operator
		//prinln it will print on console with new line
		//print it will just print on console
		
		int a=10;
		int b=20;
		String c="K";
		String c1="R";
		System.out.println(a+b);
		System.out.println(c+c1);
		
		System.out.println(a+b+c+c1);//30KR
		System.out.println(c+c1+a+b);//KR1020
		
		System.out.println(a+c+b+c1);//10K20R
		System.out.println(b+c1+a+c);//20R10K
		
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		
		System.out.println(c);//K
		System.out.print(c1);
		System.out.println(c);//RK
	}

}
