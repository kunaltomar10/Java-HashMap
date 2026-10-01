import java.util.HashMap;

public class HashMapSize {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");
		
		System.out.println(map);
		
		System.out.println("HashMap Size :"+map.size());
	}

}
