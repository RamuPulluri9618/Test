package Programes;

public class DimondPriting {
	
	static void pattern1() {
		int n=5;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	static void pattern2() {
		
		int n=5;
		for(int i=n;i>0;i--) {
			
			for(int j=0;j<i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void pattern3() {
		
		int n=5;
		int spaces=n-1;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=spaces;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			
			spaces--;
			System.out.println();
		}
		
		
	}
	
	
	static void pattern4() {
		
		int n=5;
		
		for(int i=5;i>=0;i--) {
			int space=0;
			for(int j=0;j<n-1;j++) {
				
				
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			space++;
			System.out.println();
		}
		
	}
	
	
	static void pattern5() {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			
			int spaces=n-1;
			
			for(int j=0;j<spaces;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			spaces--;
		}
		
		
		
		for(int i=5;i>0;i--) {
			
			int spaces=0;
			
			for(int j=0;j<n-1;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			spaces++;
		}

	}

	public static void main(String[] args) {
		
		//pattern3();
		pattern5();
	}
	
	

}
