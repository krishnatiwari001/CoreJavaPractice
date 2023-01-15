package JavaBasic;

import java.util.Hashtable;

public class HashTable_7 {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put(1, "Krishna");
		h.put(2, "Tiwari");
		h.put(3, 32);
		System.out.println(h.size());
		System.out.println(h.get(0));
		
		//print all values
		for(int i=1;i<=h.size();i++)
		{
			System.out.println("Hashtable key "+i+" value is: "+h.get(i));
		}
		
		//integer
		Hashtable<Integer,String> h1=new Hashtable<Integer,String>();
		h1.put(1,"Aman");
		h1.put(2, "Tuktuk");
		h1.put(3, "Sachin");
		//h1.put(4, 1000)//it will throw error because this hashtable defined as integer string and i am passing integer,integeer
		for(int j=1;j<=h.size();j++)
		{
			System.out.println("Hashtable key "+j+" value is: "+h1.get(j));
		}
	}

}
