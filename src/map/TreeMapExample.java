
package map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {

    public static void main(String[] args) {

        // 1. Create a TreeMap
        TreeMap<Integer, String> students = new TreeMap<>();

        // 2. Insert entries in an unsorted order
        students.put(103, "Michael");
        students.put(101, "Abraham");
        students.put(105, "Samuel");
        students.put(102, "Daniel");
        students.put(104, "David");

        // 3. Display entries in sorted key order
        System.out.println("Original TreeMap: " + students);

        // 4. Access a value using its key
        System.out.println("Student 101: " + students.get(101));

        // 5. Check whether a key exists
        System.out.println("Contains key 103: "
                + students.containsKey(103));

        // 6. Check whether a value exists
        System.out.println("Contains value Daniel: "
                + students.containsValue("Daniel"));

        // 7. Update an existing value
        students.put(102, "Daniel Updated");

        System.out.println("After updating: " + students);

        // 8. Get the first and last entries
        System.out.println("First entry: " + students.firstEntry());
        System.out.println("Last entry: " + students.lastEntry());

        // 9. Get the smallest and largest keys
        System.out.println("First key: " + students.firstKey());
        System.out.println("Last key: " + students.lastKey());

        // 10. Find the closest key greater than or equal to 103
        System.out.println("Ceiling key of 103: "
                + students.ceilingKey(103));

        // 11. Find the closest key less than or equal to 103
        System.out.println("Floor key of 103: "
                + students.floorKey(103));

        // 12. Get keys smaller than 103
        System.out.println("HeadMap: " + students.headMap(103));

        // 13. Get keys greater than or equal to 103
        System.out.println("TailMap: " + students.tailMap(103));

        // 14. Remove an entry
        students.remove(105);

        System.out.println("After removing key 105: " + students);

        // 15. Iterate through entries
        System.out.println("All students:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    "ID: " + entry.getKey()
                    + ", Name: " + entry.getValue()
            );
        }

        // 16. Get the size
        System.out.println("Size: " + students.size());

        // 17. Check whether the map is empty
        System.out.println("Is empty: " + students.isEmpty());
    }
}
