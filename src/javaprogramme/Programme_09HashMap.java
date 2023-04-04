package javaprogramme;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_09HashMap {
    HashMap<Integer, String> map = new HashMap<>();

    public void addElement() {
        map.put(1, "Gujarat");
        map.put(6, "Maharashtra");
        map.put(4, "Rajasthan");
        map.put(5, "Karnataka");
        map.put(2, "Madhyapradesh");
        map.put(3, "Delhi");
        for (Map.Entry<Integer, String> map : map.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

    public static void main(String[] args) {
        Programme_09HashMap obj = new Programme_09HashMap();
        obj.addElement();
    }
}
