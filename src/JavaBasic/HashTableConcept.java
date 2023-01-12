package JavaBasic;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("1","Krishna");
		h.put("2","Tiwari");
		h.put("3", 32);
		System.out.println(h.get("3"));
		
		//Hashtable integer string
		Hashtable <Integer,String> h1 = new Hashtable<Integer,String>();
		h1.put(1, "Sachin");
		h1.put(2, "Saubhya");
		h1.put(3, "Ayush");
		h1.put(4, "Krishna");
		//h1.put("1","String");//it will throw error because we are entering integer instead of string 
		//print all value
		for (int i=1; i<=h1.size();i++)
		{
			System.out.println("Value of Key "+i+" Is : "+h1.get(i));
		}
	}

}
