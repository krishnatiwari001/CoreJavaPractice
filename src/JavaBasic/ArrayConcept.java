package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		//array: to store similar data type values in a array variable
		//lowest bound : 0;
		//Highest bound : n-1(n is size of array)
		//One dimension array
		//size is fixed: static array: to over come this problem we can use ArrayList or Hashtable Dynamic array.
		//store only similar data type values: to over come this problems we can use Object array.
		
		int i[]  = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		
		System.out.println(i.length);//it will give size of array
		//System.out.println(i[4]);// it will throw error because this is not declare in array ArrayIndexOutOfBoundsException
		
		//it print all values of array
		for(int j=0; j<i.length;j++)
		{
			System.out.println("Integer Array index "+j+" "+"Value is"+" "+i[j]);
		}
		
		//double Array
		double d[] = new double[4];
		d[0]=12.5;
		d[1]=25.32;
		d[2]=58.25;
		d[3]=85.25;
		System.out.println(d[2]);
		
		//print value of all array
		for(int k=0; k<d.length;k++)
		{
			System.out.println("Double Array Index "+k+" "+"Value is"+" "+d[k]);
		}
		
		//char Array
		char c[] = new char[4];
		c[0]='K';
		c[1]='R';
		c[2]='I';
		c[3]='S';
		
		System.out.println(c[2]);
		for(int l=0;l<c.length;l++)
		{
			System.out.println("Char Array Index "+l+" "+"Value is"+" "+c[l]);
		}
		
		//String Array (String is a class not a data type)
		String s[] = new String[4];
		s[0]="Krishna";
		s[1]="Tiwari";
		s[2]="Age";
		s[3]="32";
		
		System.out.println(s[2]);
		for(int m=0;m<s.length;m++)
		{
			System.out.println("String Array Index "+m+" "+"Value is"+" "+s[m]);
		}
		
		//Object Array
		Object obj[] = new Object[6];
		obj[0]="Name";
		obj[1]="Krishna";
		obj[2]="Tiwari";
		obj[3]="Age";
		obj[4]="32";
		obj[5]="Mumbai";
	
		System.out.println(obj[3]);
		for(int n=0;n<obj.length;n++)
		{
			System.out.println("Object Array Index "+n+" "+"Value is"+" "+obj[n]);
		}
	}

}
