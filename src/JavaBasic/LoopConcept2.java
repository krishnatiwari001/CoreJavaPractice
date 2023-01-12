package JavaBasic;

public class LoopConcept2 {

	public static void main(String[] args) {
		//while loop
		//Dis advantage of while loop: if we did not write inremental or decremental part in while loop it will generate infinite loop
		//while and for is keywore in java so we have to write in small letters
		
		int i=1;//initialization
		while(i<10)//conditional
		{
			System.out.println(i);
			i++; //increment
		}
		
		for(int j=10;j>1;j--)//initialization,condition,decrement
		{
			System.out.println(j);
		}

	}

}
