package Java;

import java.util.HashMap;

public class Map {
	
	static void mapMethods() {
		
		
		HashMap<Integer,String> ab= new HashMap<>();
		HashMap<Integer,String> abc= new HashMap<Integer,String>();
		//put(K, V) 
		ab.put(1, "ramu");
		ab.put(2, "rahul");
		abc.put(3, "ajay");
		//putAll()
		abc.putAll(ab);
		//get(K)
		System.out.println(abc.get(3)+"and"+abc.get(5));
		
		for(int i=0;i<=abc.size();i++) {
			
			
			//containsKey
			if(abc.containsKey(i)) {
				
				System.out.println("Contains the key");
			}
			
			//containsValue
			if(abc.containsValue(abc.get(i))) {
				
				System.out.println("value of i"+abc.get(i));
				//System.out.println("Contains Value");
			}
			
		}
		
		//replace(K,V)
		
		abc.replace(3, "mega");
		
		//replace(K,Old Value,New value)
		
		abc.replace(2,"rahul","rakhi");
		
		//enterySet
		System.out.println(abc.entrySet());
		
		//remove(K),Remove(K,V)
		
		//KeySet(),ValueSet()
		System.out.println(abc.keySet());
		System.out.println(abc.values());
		
		//clear();
		//size();
		//isempty();
		//containsValue();
		//containsKey();
		//clone();
		//merge();
		//compute();
		//computeIfAbsent()	computes value if a mapping for the key is not present
		//computeIfPresent()
		
		
		
		
	}

	public static void main(String[] args) {
		
		mapMethods();
	}

}
