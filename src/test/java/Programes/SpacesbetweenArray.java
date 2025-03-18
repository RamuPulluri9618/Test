package Programes;

import java.util.Arrays;
import java.util.Scanner;

public class SpacesbetweenArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int ab=sc.nextInt();
		int[] abc= new int[ab];
		int sum=0;
		
		for(int i=0;i<abc.length;i++) {
			
			
			abc[i]=sc.nextInt();
			sum=sum+abc[i];
			
		}
		System.out.println("sum is"+sum);
		
		int spaces=(sum/ab)+1;
		
		System.out.println("spaces is"+spaces);
		
		
		System.out.println("array elemets are"+Arrays.toString(abc));
		
		
		

	}

}
