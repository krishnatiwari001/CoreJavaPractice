package JavaBasic;

import java.util.ArrayList;

public class ArrayListConcept1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("Krishna");
		ar.add(1);
		ar.add('K');
		System.out.println(ar.get(0));
		System.out.println(ar.size());//it will print size of ArrayList
		//print all ArrayList values
		for (int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		//we can use ArrayList for specific datatype also
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1000);
		//ar1.add("Krishna");//it will throug error because we assigned ArrayList as integer and passing String values
		System.out.println(ar1.get(0));
		
	}

}
