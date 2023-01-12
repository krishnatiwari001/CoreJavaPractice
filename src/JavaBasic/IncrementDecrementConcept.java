package JavaBasic;

public class IncrementDecrementConcept {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		//Post Increment
		b=a++;
		System.out.println(b);//1 first it will assign value of a to b after that it will increment
		System.out.println(a);//2 
		
		//Pre Increment
		b=++a;
		System.out.println(b);//3 first it will increment value of a by one after that it will assign value of a to b
		System.out.println(a);//3
		
		//Post Decrement
		int m=4;
		int n=6;
		m=n--;
		System.out.println(m);//6 first it will assign value of n to m after that it will decrease value of n by 1
		System.out.println(n);//5
		
		//Pre Decrement
		m=--n;
		System.out.println(m);//4 first it will decrease value of n by 1 after that it will assign to m
		System.out.println(n);//4
	}

}
