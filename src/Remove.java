import java.util.HashMap;

public class Remove {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");
		
		System.out.println("The Original linked map:"+map);
		map.clear();
		
		System.out.println("New Map :"+map);
	}

}
