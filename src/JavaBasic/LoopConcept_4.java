package JavaBasic;

public class LoopConcept_4 {

	public static void main(String[] args) {
		//Disadvantage of while loop: if you did not write increment or decrement part in while loop it will generate infinite loop
		//for,while is keyword in java we have to write in small letter
		
		//while loop
		int i=1;//initialization
		while(i<10)//condition
		{
			System.out.println(i);
			i++;//increment
		}
		System.out.println("##################");
		
		int j=10;//initialization
		while(j>1)//condition
		{
			System.out.println(j);
			j--;//decrement
		}
		System.out.println("##################");
		
		//for loop
		for(int k=0;k<10;k++)//initialization,condition,increment
		{
			System.out.println(k);
		}
		System.out.println("##################");
		
		for(int l=10;l>0;l--)//initialization,condition,increment
		{
			System.out.println(l);
		}
	}

}
