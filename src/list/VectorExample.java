
package list;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        // 1. Create a Vector
        Vector<Integer> numbers = new Vector<>();

        // 2. Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        System.out.println("Original: " + numbers);

        // 3. Add an element at a specific index
        numbers.add(1, 15);

        System.out.println("After adding: " + numbers);

        // 4. Access an element
        System.out.println("Element at index 2: " + numbers.get(2));

        // 5. Update an element
        numbers.set(2, 25);

        System.out.println("After updating: " + numbers);

        // 6. Remove an element by value
        numbers.remove(Integer.valueOf(30));

        System.out.println("After removing 30: " + numbers);

        // 7. Check whether a value exists
        System.out.println("Contains 10: " + numbers.contains(10));

        // 8. Get the size
        System.out.println("Size: " + numbers.size());

        // 9. Get the current capacity
        System.out.println("Capacity: " + numbers.capacity());

        // 10. Iterate through the Vector
        System.out.println("All elements:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
