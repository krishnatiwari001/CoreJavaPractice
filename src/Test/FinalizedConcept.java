package Test;

public class FinalizedConcept {
	//Finalized is a method
	//finalized method is used to clear unused space in memory which is occupied by unused objects
	
	public void finalized()
	{
		System.out.println("This is finalized method");
	}
	public static void main(String[] args) {
		FinalizedConcept f1 = new FinalizedConcept();
		FinalizedConcept f2 = new FinalizedConcept();
		f1 = null;
		f2 = null;
		//below method will clean java memory
		System.gc();//calling garbage collection method 
				
	
	}

}
