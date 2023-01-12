package ReverseString;

import java.util.ArrayList;

public class FirstCode {

	public static void main(String[] args) {
		String name ="Krishna";
		ArrayList ar = new ArrayList();
		for(int i=0;i<name.length();i++)
		{
			ar.add(i);
			System.out.println("Index "+i+ "Added Sucessfully"+ar.add(i));
			
			for(int j=0;j<ar.size();j++)
			{
				System.out.println(ar.get(j));
			}
		}
	}

}
