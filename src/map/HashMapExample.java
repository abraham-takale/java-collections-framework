
package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        // 1. Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // 2. Add key-value pairs
        students.put(101, "Abraham");
        students.put(102, "Daniel");
        students.put(103, "Michael");

        System.out.println("Original HashMap: " + students);

        // 3. Access a value using its key
        System.out.println("Student 101: " + students.get(101));

        // 4. Check whether a key exists
        System.out.println("Contains key 102: "
                + students.containsKey(102));

        // 5. Check whether a value exists
        System.out.println("Contains value Daniel: "
                + students.containsValue("Daniel"));

        // 6. Update an existing value
        students.put(102, "David");

        System.out.println("After updating: " + students);

        // 7. Add an element only if the key is absent
        students.putIfAbsent(104, "Samuel");

        System.out.println("After putIfAbsent: " + students);

        // 8. Remove an entry using its key
        students.remove(103);

        System.out.println("After removing key 103: " + students);

        // 9. Get the size
        System.out.println("Size: " + students.size());

        // 10. Iterate through keys and values
        System.out.println("All students:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(
                    "ID: " + entry.getKey()
                    + ", Name: " + entry.getValue()
            );
        }

        // 11. Check whether the HashMap is empty
        System.out.println("Is empty: " + students.isEmpty());
    }
}
