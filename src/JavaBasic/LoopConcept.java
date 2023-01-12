package JavaBasic;

public class LoopConcept {

	public static void main(String[] args) {
		//while loop: dis advantage: if we did not write increment or decrement part in loop body it will generate infinite loop
		//while and for is keyword in java so we have to write in small letters
		
	int i=1;
	while(i<10)
	{
		System.out.println(i);
		i++;
	}
	System.out.println("-----------------");
	
	int j=10;
	while(j>0)
	{
		System.out.println(j);
		j--;
	}
	System.out.println("-----------------");
	
	for(int k=1; k<10; k++)
	{
		System.out.println(k);
	}
	System.out.println("-----------------");
	
	for(int l=10; l>0; l--)
	{
		System.out.println(l);
	}
	}

}
