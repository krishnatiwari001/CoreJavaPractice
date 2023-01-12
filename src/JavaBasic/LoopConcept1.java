package JavaBasic;

public class LoopConcept1 {

	public static void main(String[] args) {
		//while is a keyword in java
		//disadvantage of while loop: if we not give increment or decrement part in while loop body it will generate infinit loop
		
		//while
		int a=10;
		while(a>0)
		{
			System.out.println(a);
			a--;
		}
		System.out.println("--------------------");
		
		int b=0;
		while(b<10)
		{
			System.out.println(b);
			b++;
		}
		System.out.println("--------------------");
		
		//for
		for(int i=0; i<10; i++)
		{
			System.out.println(i);
		}
		System.out.println("--------------------");
		
		for(int j=10; j>0; j--)
		{
			System.out.println(j);
		}
		System.out.println("--------------------");
	}

}
