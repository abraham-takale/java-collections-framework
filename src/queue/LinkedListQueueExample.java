
package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {

    public static void main(String[] args) {

        // 1. Create a Queue using LinkedList
        Queue<Integer> numbers = new LinkedList<>();

        // 2. Add elements to the queue
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original Queue: " + numbers);

        // 3. Add another element using offer()
        numbers.offer(40);

        System.out.println("After adding 40: " + numbers);

        // 4. View the front element without removing it
        System.out.println("Peek: " + numbers.peek());

        // 5. Remove and return the front element
        System.out.println("Poll: " + numbers.poll());

        System.out.println("After poll: " + numbers);

        // 6. Check whether an element exists
        System.out.println("Contains 20: " + numbers.contains(20));

        // 7. Get the size
        System.out.println("Size: " + numbers.size());

        // 8. Process all remaining elements
        System.out.println("Processing queue:");

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }

        // 9. Check whether the queue is empty
        System.out.println("Is empty: " + numbers.isEmpty());
    }
}
