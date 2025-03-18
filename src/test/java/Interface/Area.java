package Interface;

public interface Area {

	
	void area();
	
	default void getperimeter() {
		
		System.out.println("I know side value");
	}
}
