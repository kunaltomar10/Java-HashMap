import java.util.HashMap;

public class SpecifiedValue {

	public static void main(String[] args) {
		
		HashMap<Integer ,String> map=new HashMap<>();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");
		
	    System.out.println("Orignal Map :"+map);
	    
	    System.out.println(" Is key 'Green' exists? ");
	    
	    if (map.containsValue("Green")) {
            System.out.println("yes! - " );
        } else {
            System.out.println("no!");
        }

        System.out.println("2. Is key 'orange' exists?");

        if (map.containsValue("orange")) {
            System.out.println("yes! - " );
        } else {
            System.out.println("no!");
	    
	    
	}
  }
}


