package Programes;

public class DimondPriting {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			
			int spaces=n-1;
			
			for(int j=0;j<spaces;j++) {
				
				System.out.print("@");
				
			}
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			spaces--;
		}
		
		
		
		for(int i=5;i>0;i--) {
			
			int spaces=0;
			
			for(int j=0;j<n-1;j++) {
				
				System.out.print("@");
				
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			spaces++;
		}

	}
	
	

}
