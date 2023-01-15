package JavaBasic;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		int a=1;
		int b=a++;//post increment first it will assign value of i to j after that it will increase by 1
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=3;
		int d=++c;//pre increment first it will increase value of c by 1 after that it will assign to d
		System.out.println(c);//3
		System.out.println(d);//4
		
		int e=5;
		int f=e--;//Post decrement first it will assign value of e to f after tha decrease value of e by 1
		System.out.println(e);//4
		System.out.println(f);//5
		
		int g=8;
		int h=--g;//pre decrement first it will decrease value of g by 1 after that  it will assign to h
		System.out.println(g);
		System.out.println(h);
	}

}
