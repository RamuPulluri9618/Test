package Programes;

public class TypeCasting {
	
	static void typeCast() {
		
		double b= 90.345;
		byte c=(byte)b;
		System.out.println("Value of byte is"+c);
		
		int i=(int)b;
		System.out.println("Value of int is"+i);
		
		float j=(float)b;
		System.out.println("Value of float is"+j);
		
		long k=(long)b;
		System.out.println("Value of long is"+k);
		
		char l=(char)b;
		System.out.println("Value of char is"+l);
		
		short s=(short)b;
		System.out.println("Value of short is"+l);
		
		String q=String.valueOf(b);
		
		System.out.println("Value of short is"+q.length());
		
		
	}
	
	static void widorcasting() {
		byte b=10;
		
		short s=b;
		int i=b;
		long l=b;
		float f=b;
		char c=(char) b;
		
		
		double d=b;
		
		System.out.println("short value is"+s);
		System.out.println("double value is"+d);
		
		
	}
	
	
	

	public static void main(String[] args) {
		//typeCast();
		widorcasting();
	}

}
