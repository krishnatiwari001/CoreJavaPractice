package JavaBasic;

public class ArrayConcept_5 {

	public static void main(String[] args) {
		//one Dimensional array
		//Array: we can use array to store similar data type values in array variable
		//1.integer array: to store similar data type value in array variable
		// lowest bond index is 0
		//upper bound index is n-1(n is size of array)

		//disadvantage of array
		//1.size is fixed-static array-to overcome this problem we can use Collections,ArrayList,HashTable -Dynamic array
		//2.store only similar data type values- to overcome this problem we can use Object array
		
		//integer array
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i.length);//it will print size of array
		System.out.println(i[2]);//30
		//System.out.println(i[4]);//it will throw ArrayIndexOutOfBoundsException because i[4] is not declared in array
		//print all values of integer array
		for(int j=0;j<i.length;j++)
		{
			System.out.println("Integer array index "+j+" value is: "+i[j]);
		}
		
		//Double array
		double d[] = new double[4];
		d[0]=10.20;
		d[1]=20.30;
		d[2]=30.40;
		d[3]=40.50;
		System.out.println(d.length);
		System.out.println(d[2]);
		
		//char array
		char c[] = new char[4];
		c[0]='K';
		c[1]='R';
		c[2]='I';
		c[3]='S';
		System.out.println(c[3]);
		System.out.println(c.length);
		
		//boolean array
		boolean b[] = new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[1]);
		System.out.println(b.length);
		
		//String array
		String s[]=new String[4];
		s[0]="Krisna";
		s[1]="Tiwari";
		s[2]="Age";
		s[3]="32";
		System.out.println(s.length);
		System.out.println(s[2]);
		
		//Object array(Object array is class)
		Object obj[]=new Object[6];
		obj[0]="Krishna";
		obj[1]="Tiwari";
		obj[2]="Age";
		obj[3]=32;
		obj[4]=5.11;
		obj[5]='M';
		System.out.println(obj.length);
		System.out.println(obj[5]);
		for(int k=0;k<obj.length;k++)
		{
			System.out.println("Object array index "+k+"value is: "+obj[k]);
		}
		
		System.out.println("######### Two Dimension Array ###################");
		
		//Two Dimension array
		int ar[][]=new int[4][3];
		//int[4] is row
		//int[3] is column
		
		System.out.println("Row size"+ar.length);//length of row
		System.out.println("Column size"+ar[0].length);//length of column
		
		//first row
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[0][2] = 30;
		
		//Second row
		ar[1][0] = 50;
		ar[1][1]=60;
		ar[1][2]=70;
		
		//third row
		ar[2][0]=90;
		ar[2][1]=100;
		ar[2][2]=110;
		
		//Fourth row
		ar[3][0]=130;
		ar[3][1]=140;
		ar[3][2]=150;
		
		
		System.out.println(ar[1][1]);//this will print specific value
		
		//print all values of 2d array
		for(int k=0;k<ar.length;k++)
		{
			for(int l=0;l<ar[0].length;l++)
			{
				System.out.println("Two Dimension array row "+k+" columns "+l+" value is: "+ar[k][l]);
			}
		}
		
	}

}
