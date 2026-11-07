
package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // 1. Create a LinkedHashMap
        LinkedHashMap<Integer, String> students =
                new LinkedHashMap<>();

        // 2. Insert key-value pairs
        students.put(101, "Abraham");
        students.put(102, "Daniel");
        students.put(103, "Michael");

        System.out.println("Original LinkedHashMap: " + students);

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

        // 7. Add an element if the key does not exist
        students.putIfAbsent(104, "Samuel");

        System.out.println("After putIfAbsent: " + students);

        // 8. Remove an entry
        students.remove(103);

        System.out.println("After removing key 103: " + students);

        // 9. Iterate through entries
        System.out.println("Students in insertion order:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    "ID: " + entry.getKey()
                    + ", Name: " + entry.getValue()
            );
        }

        // 10. Iterate through keys
        System.out.println("Student IDs:");

        for (Integer id : students.keySet()) {
            System.out.println(id);
        }

        // 11. Get the size
        System.out.println("Size: " + students.size());

        // 12. Check whether the map is empty
        System.out.println("Is empty: " + students.isEmpty());
    }
}
