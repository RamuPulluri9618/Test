package Interface;

public class Square implements Area {

	@Override
	public void area() {
		int side=10;
		
		int area;
		System.out.println(area=side*side);
	}

	public void getperimeter() {
		
		System.out.println("side is 10");
	}
	
}
