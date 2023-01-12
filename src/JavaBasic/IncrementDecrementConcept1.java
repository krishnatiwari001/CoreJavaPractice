package JavaBasic;

public class IncrementDecrementConcept1 {

	public static void main(String[] args) {
		//++ increment operator
		//-- Decrement operator
		
		int i=1;
		int j=i++;//Post Increment: first it will assign value of i to j after that it will increment value of i by 1
		System.out.println(i);//2
		System.out.println(j);//1
		
		//PreIncrement
		int k=2;
		int l=++k;//first it will increase value of k by 1 after that it will assign to l
		System.out.println(k);//3
		System.out.println(l);//3
		
		//PostDecrement
		int m=6;
		int n=m--;//first it will assign value of m to n after that it will decrease by 1
		System.out.println(n);//6
		System.out.println(m);//5
		
		//PreDecrement
		int o=8;
		int p=--o;//first it will decrease value of o by 1 after that it will assign to p
		System.out.println(o);//7
		System.out.println(p);//7
	
	}

}
