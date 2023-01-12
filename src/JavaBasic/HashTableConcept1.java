package JavaBasic;

import java.util.Hashtable;

public class HashTableConcept1 {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, 100);
		System.out.println(h.get(1));
		
		//integer string Hashtable
		Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
		h1.put(1,"Krishna");
		h1.put(2, "Tiwari");
		h1.put(3, "Age");
		h1.put(4, "Gender");
		
		System.out.println(h1.get(1));
		
		System.out.println(h1.size());//it wil display size of hashtable
		////duplicate keys is not allowed in Hashtable if i give duplicate key it will override existing value
		
		System.out.println("************");
		//print all values of Hashtable
		for(int i=1;i<=h1.size();i++)
		{
			System.out.println(h1.get(i));
		}
	}

}
