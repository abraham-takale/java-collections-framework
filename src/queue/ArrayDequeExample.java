
package queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        // 1. Create an ArrayDeque
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        // 2. Add elements at the rear
        numbers.addLast(20);
        numbers.addLast(30);

        // 3. Add an element at the front
        numbers.addFirst(10);

        System.out.println("Original Deque: " + numbers);

        // 4. Add another element at the rear
        numbers.offerLast(40);

        // 5. Add another element at the front
        numbers.offerFirst(5);

        System.out.println("After adding: " + numbers);

        // 6. View the first and last elements
        System.out.println("First: " + numbers.peekFirst());
        System.out.println("Last: " + numbers.peekLast());

        // 7. Remove the first element
        System.out.println("Removed first: " + numbers.pollFirst());

        // 8. Remove the last element
        System.out.println("Removed last: " + numbers.pollLast());

        System.out.println("After removing: " + numbers);

        // 9. Search for an element
        System.out.println("Contains 20: " + numbers.contains(20));

        // 10. Get the size
        System.out.println("Size: " + numbers.size());

        // 11. Iterate through the Deque
        System.out.println("All elements:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
