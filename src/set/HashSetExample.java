
package set;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        // 1. Create a HashSet
        HashSet<Integer> numbers = new HashSet<>();

        // 2. Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println("HashSet: " + numbers);

        // 3. Check whether an element exists
        System.out.println("Contains 20: " + numbers.contains(20));

        // 4. Remove an element
        numbers.remove(10);

        System.out.println("After removing 10: " + numbers);

        // 5. Get the size
        System.out.println("Size: " + numbers.size());

        // 6. Iterate through the HashSet
        System.out.println("All elements:");

        for (int number : numbers) {
            System.out.println(number);
        }

        // 7. Check whether the HashSet is empty
        System.out.println("Is empty: " + numbers.isEmpty());

        // 8. Remove all elements
        numbers.clear();

        System.out.println("After clear: " + numbers);
        System.out.println("Is empty now: " + numbers.isEmpty());
    }
}
