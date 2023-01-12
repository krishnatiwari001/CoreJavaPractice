package JavaBasic;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("Krishna");
		ar.add("Age");
		ar.add(32);
		ar.add('c');
		
		System.out.println(ar.get(0));
		//print all ArrayList Values
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//Integer ArrayList
		ArrayList <Integer> ar1 = new ArrayList <Integer>();
		ar1.add(25);
		//ar1.add("Krishna");//we can not add string value because it is created integer array
		System.out.println(ar1.get(0));
	}

}
