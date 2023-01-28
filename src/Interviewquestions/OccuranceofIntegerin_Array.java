package Interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class OccuranceofIntegerin_Array {

	static void repeated() {
		int[] ab = { 1, 2, 3, 1, 2, 1 };
		HashMap<Integer,Integer> abd=new HashMap<Integer,Integer>();
		
		for(int i=0;i<ab.length;i++) {
			
			//for(int j=i+1;j<ab.length;j++) {
				
				//if(ab[i]==ab[j]) {
			
					if(abd.containsValue(ab[i])) {
						
						abd.put(ab[i], abd.get(ab[i])+1);
					}
					else {
						abd.put(ab[i], 1);
						
					}
					
					
				//}
				
			//}
			
		}
		
		System.out.println(abd.entrySet());
		
		
	}
	
	public void hashsetRepated() {
		
		HashSet<Integer> abc = new HashSet();
		int[] ab = { 1, 2, 3, 1, 2 };

		System.out.println("Array Elements Are" + Arrays.toString(ab));

		for (int i = 0; i < ab.length; i++) {

			abc.add(ab[i]);

		}
		System.out.println(abc);

	}
	
	public static void arraylistRepated() {
		
		int[] ab= {1,2,3,2,1};
		ArrayList<Integer> abd= new ArrayList<Integer>();
		
		for(int i=0;i<ab.length;i++) {
			
			if(!abd.contains(ab[i])) {
				
				
				abd.add(ab[i]);
				
			}
			
			
			
		}
		
		System.out.println("Array list not repated"+abd);
		
	}

	public static void main(String[] args) {

		//repeated();
		arraylistRepated();
		
	}

}
