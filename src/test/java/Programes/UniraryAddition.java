package Programes;

import java.util.Scanner;

public class UniraryAddition {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int b=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<b;i++) {
			
			int ab=(int) Math.pow(2, i);
			//sum=sum+ab;
			sum +=ab;
			System.out.println("power of"+i+" "+ab);
		}

		System.out.println(sum);
	}

}
