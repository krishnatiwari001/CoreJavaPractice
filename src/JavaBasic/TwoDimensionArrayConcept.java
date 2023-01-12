package JavaBasic;

public class TwoDimensionArrayConcept {
	public static void main(String args[])
	{
		int[][] x = new int[4][4];
		
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		x[0][3]=4;
		
		x[1][0]=5;
		x[1][1]=6;
		x[1][2]=7;
		x[1][3]=8;
		
		x[2][0]=9;
		x[2][1]=10;
		x[2][2]=11;
		x[2][3]=12;
		
		x[3][0]=13;
		x[3][1]=14;
		x[3][2]=15;
		x[3][3]=16;
		
		System.out.println(x[1][0]);
		
		System.out.println(x.length);//it will print row count
		System.out.println(x[0].length);//it will print column count
		//Print all values of array using loop
		for(int row=0;row<x.length;row++)
		{
			for (int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
			}
		}
	}

}
