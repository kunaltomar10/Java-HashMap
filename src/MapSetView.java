import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSetView {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Red");
        map.put(2, "White");
        map.put(3, "Blue");
        map.put(4, "Black");
        map.put(4, "Green");

        Set<Map.Entry<Integer, String>> set = map.entrySet();

        System.out.println("Set values: " + set);
    }
}