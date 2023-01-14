package JavaBasic;

public class StringConcatenation_2 {

	public static void main(String[] args) {
		//Execution always start from left to right
		//+ is called concatenation operator 
		//print ln: it will use to print on console with new
		//print: it will just print on console
		
		int a=50;
		int b=60;
		String c="Krishna";
		String d="Tiwari";
		double e=20.30;
		double f=70.90;
		
		System.out.println(a+b);//110
		System.out.println(c+d);//KrishnaTiwari
		System.out.println(e+f);//91.20
		
		System.out.println(a+b+c+d+e+f);//110KrishnaTiwari20.3070.90
		System.out.println(e+f+a+b+c+d);//201.20KrishnaTiwari
		System.out.println(c+d+a+b+e+f);//KrishnaTiwari506020.3070.90
		
		System.out.println(c);//Krishna
		System.out.print(d);//Tiwari
		System.out.println(e);//Tiwari20
		
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		System.out.println("Value of c is: "+c);
		
	}

}
