import java.util.HashMap;

public class SpecifiedKey {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<>();
		
		map.put("Red", 1);
		map.put("Green", 2);
		map.put("Black", 3);
		map.put("White", 4);
		map.put("Blue", 5);
		
	    System.out.println("Orignal Map :"+map);
	    
	    System.out.println(" Is key 'Green' exists? ");
	    
	    if (map.containsKey("Green")) {
            System.out.println("yes! - " + map.get("Green"));
        } else {
            System.out.println("no!");
        }

        System.out.println("2. Is key 'orange' exists?");

        if (map.containsKey("orange")) {
            System.out.println("yes! - " + map.get("orange"));
        } else {
            System.out.println("no!");
	    
	    
	}
  }
}
