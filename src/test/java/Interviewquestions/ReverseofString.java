package Interviewquestions;

public class ReverseofString {
	
	
	static String reverse(String ab) {
		
		String[] abc=ab.split(" ");
		String rev="";
		
		for(int i=abc.length-1;i>=0;i--) {
			
			rev+=abc[i]+" ";
			
			
		}
		
		
		
		return rev;
		
		
		
	}
	
	static void rev2() {
		
		String ab="Ramu is Bad";
		String rev="";
		
		for(int i=0;i<ab.length();i++) {
			
			char abb=ab.charAt(i);
			rev=abb+rev;
		}
		System.out.println("rev"+rev);

	}

	public static void main(String[] args) {
//		String ab="Ramu is Bad";
//		
//		String revd=reverse(ab);
//		System.out.println("revers is"+"  "+revd);
		rev2();

	}
	
	

}
