package JavaBasic;

public class StringConcatenation3 {

	public static void main(String[] args) {
		//Execution always start from left to right
		//+: is called concatenation operator
		//println: is use of console to print new line
		//print: is use to just print on console
		int a=100;
		int b=200;
		double c=10.54;
		double d=32.45;
		String s="Krishna";
		String s1="Tiwari";
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(s+s1);
		
		System.out.println(a+b+c+d+s+s1);
		System.out.println(a+b+s+s1+c+d);//300KrishnaTiwari10.5432.45
		System.out.println(s+s1+a+b+c+d);//KrishnaTiwari10020032.4510.54
		
		System.out.println(a);//10
		System.out.print(s);//Krishna
		System.out.println(b);//Krishna200, it will print like this because i did not used prinln in above line of code

	}

}
