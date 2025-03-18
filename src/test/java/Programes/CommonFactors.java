package Programes;

import java.util.Scanner;

public class CommonFactors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=1;i<10000;i++) {
			
			if((a%i==0)&&(b%i==0)) {
				
				
				System.out.println("common factor"+i);
			}
		}

	}

}
