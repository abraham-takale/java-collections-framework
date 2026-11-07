
package map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

    public static void main(String[] args) {

        // 1. Create a Hashtable
        Hashtable<Integer, String> students = new Hashtable<>();

        // 2. Insert key-value pairs
        students.put(101, "Abraham");
        students.put(102, "Daniel");
        students.put(103, "Michael");

        System.out.println("Original Hashtable: " + students);

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

        // 7. Add an entry only if the key is absent
        students.putIfAbsent(104, "Samuel");

        System.out.println("After putIfAbsent: " + students);

        // 8. Get a value with a default
        System.out.println("Student 105: "
                + students.getOrDefault(105, "Not Found"));

        // 9. Remove an entry
        students.remove(103);

        System.out.println("After removing key 103: " + students);

        // 10. Iterate through entries
        System.out.println("All students:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    "ID: " + entry.getKey()
                    + ", Name: " + entry.getValue()
            );
        }

        // 11. Get the size
        System.out.println("Size: " + students.size());

        // 12. Check whether the Hashtable is empty
        System.out.println("Is empty: " + students.isEmpty());

        // 13. Remove all entries
        students.clear();

        System.out.println("After clear: " + students);
        System.out.println("Is empty after clear: " + students.isEmpty());
    }
}
