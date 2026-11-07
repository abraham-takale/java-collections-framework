
package list;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // 1. Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        System.out.println("Original: " + numbers);

        // 3. Access an element
        System.out.println("First element: " + numbers.get(0));

        // 4. Update an element
        numbers.set(1, 50);

        // 5. Remove the value 30
        numbers.remove(Integer.valueOf(30));

        // 6. Search for an element
        System.out.println("Contains 10: " + numbers.contains(10));

        // 7. Get the size
        System.out.println("Size: " + numbers.size());

        // 8. Iterate through the ArrayList
        System.out.println("All elements:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
