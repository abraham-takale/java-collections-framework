
package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        // 1. Create a LinkedHashSet
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        // 2. Add elements
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        System.out.println("Original: " + numbers);

        // 3. Check whether an element exists
        System.out.println("Contains 20: " + numbers.contains(20));

        // 4. Remove an element
        numbers.remove(10);

        System.out.println("After removing 10: " + numbers);

        // 5. Add another element
        numbers.add(50);

        System.out.println("After adding 50: " + numbers);

        // 6. Get the size
        System.out.println("Size: " + numbers.size());

        // 7. Iterate through the LinkedHashSet
        System.out.println("All elements:");

        for (int number : numbers) {
            System.out.println(number);
        }

        // 8. Check whether the set is empty
        System.out.println("Is empty: " + numbers.isEmpty());

        // 9. Remove all elements
        numbers.clear();

        System.out.println("After clear: " + numbers);
    }
}
