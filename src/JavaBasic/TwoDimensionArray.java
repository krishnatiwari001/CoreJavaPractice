package JavaBasic;

public class TwoDimensionArray {

	public static void main(String[] args) {
		String x[][]= new String[2][2];
		System.out.println("Row Length "+x.length);
		System.out.println("Column Length "+x[0].length);
		//1st row
		x[0][0]="K";
		x[0][1]="R";
		
		//2nd row
		x[1][0]="I";
		x[1][1]="S";
		
		System.out.println(x[1][1]);
		
		//Print all row and column of array
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
			}
		}
	}

}
