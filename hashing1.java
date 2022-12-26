import java.util.HashMap;

public class hashing1 {
  public static void main(String args[]) {
    HashMap<String, Integer> map = new HashMap<>();

    map.put("India", 120);
    map.put("us", 120);
    map.put("china", 120);

    System.out.println(map);
    map.put("china", 180);
    System.out.println(map);

  }
}
