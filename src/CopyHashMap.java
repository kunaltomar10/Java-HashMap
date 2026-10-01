import java.util.HashMap;
public class CopyHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer ,String> map= new HashMap<>();
		
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		
        HashMap<Integer ,String> map1=new HashMap<>();
		
		map1.put(4, "White");
		map1.put(5, "Blue");
		map1.put(6, "Orange");
		
		System.out.println("Values in first map: "+map);
		
		System.out.println("Values in second map: "+map1);
		
		map1.putAll(map);
		
		System.out.println("Now values in second map: "+map1);
		
		

	}

}
