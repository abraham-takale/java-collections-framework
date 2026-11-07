
package list;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // 1. Create a LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        // 2. Add elements at the end
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original: " + numbers);

        // 3. Add an element at the beginning
        numbers.addFirst(5);

        // 4. Add an element at the end
        numbers.addLast(40);

        System.out.println("After adding: " + numbers);

        // 5. Access the first and last elements
        System.out.println("First: " + numbers.getFirst());
        System.out.println("Last: " + numbers.getLast());

        // 6. Access an element by index
        System.out.println("Element at index 2: " + numbers.get(2));

        // 7. Update an element
        numbers.set(2, 25);

        // 8. Remove the first and last elements
        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After removing: " + numbers);

        // 9. Search for an element
        System.out.println("Contains 20: " + numbers.contains(20));

        // 10. Get the size
        System.out.println("Size: " + numbers.size());

        // 11. Iterate through the LinkedList
        System.out.println("All elements:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
