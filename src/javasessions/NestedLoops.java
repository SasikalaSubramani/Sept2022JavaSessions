package javasessions;

public class NestedLoops {

	public static void main(String[] args) {

		// loop inside the loop
		
		//outer loop
		for (int i=0; i<=5; i++) {
			
			//inner loop
			for(int j=0; j<=5; j++) {
				
				System.out.print(i+""+j+" ");
				
			}
			System.out.println();
			
			
			
		}
	}

}
