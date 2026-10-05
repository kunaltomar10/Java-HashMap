import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class MapValues {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Red");
        map.put(2, "White");
        map.put(3, "Blue");
        map.put(4, "Black");
        map.put(5, "Green");

        Collection<String> values = map.values();

        System.out.println("Collection of values: " + values);
    }
}
