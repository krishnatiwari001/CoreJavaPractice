package JavaBasic;

public class StringConcatenation {

	public static void main(String[] args) {
		//Execution Always start from left to right
		//+ is Concatenation operator
		//Println: it will print on console with new line
		//Print: just it will print on console
	
		int a=10;
		int b=20;
		String s="Krishn";
		String s1="Tiwari";
		
		System.out.println(s+s1);//KrishnaTiwari
		System.out.println(a+b);//30
		
		System.out.println(a+b+s+s1);//30KrishnaTiwari
		System.out.println(a+s+b+s1);//10Krishna20Tiwari
		
		System.out.println(s+s1+a+b);//KrishnaTiwari1020
		System.out.println(b+s1+a+s1);//20Tiwari10Krishna
		
		System.out.println(s1);//it will print with new line
		System.out.print(s);//it will just print
		System.out.println(a);//krishna10 it will print together
	
	}

}
