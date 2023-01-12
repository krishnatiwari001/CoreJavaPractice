package JavaBasic;

import java.util.Hashtable;

public class HashTableConcept2 {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put("name","Krishna");
		h.put("age",32);
		System.out.println(h.get("name"));
		System.out.println(h.get("age"));
		
		Hashtable <Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		h1.put(2, 2000);
		//h1.put(3, "Krishna")//It will through error because i Declared key and value both as integer
		System.out.println(h1.get(1));
		System.out.println(h1.get(2));
		
		Hashtable <Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(1, "Kri");
		h2.put(2, "Tiwari");
		//h2.put(1, 1000)//it will through error because i assigned key as integer and value as String
		System.out.println(h2.get(2));
		System.out.println(h2.get(1));
	}

}
