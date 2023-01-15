package JavaBasic;

import java.util.ArrayList;

public class ArrayList_Concept_6 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add("Name.Krishna");
		ar.add(32);
		ar.add("Mumbai");
		ar.add(400057);
		
		System.out.println(ar.get(0));
		
		//print all value of ArrayList
		for(int i=0;i<ar.size();i++)
		{
			System.out.println("ArrayList index "+i+" value is: "+ar.get(i));
		}
		
		//Integer ArrayList
		ArrayList <Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(120);
		//ar1.add("Krishna")//it will through error because it is declare as integer
		System.out.println(ar1.get(0));
		
		//Double ArrayList
		ArrayList<Double> d = new ArrayList<Double>();
		d.add(13.50);
		d.add(52.30);
		System.out.println(d.get(0));
		
		//String
		ArrayList <String> s = new ArrayList<String>();
		s.add("Krishna");
		s.add("Tiwari");
		System.out.println(s.get(0));
		
	}

}
