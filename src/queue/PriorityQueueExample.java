
package queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        // 1. Create a PriorityQueue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // 2. Add elements
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("PriorityQueue: " + numbers);

        // 3. View the highest-priority element
        System.out.println("Peek: " + numbers.peek());

        // 4. Remove and return the highest-priority element
        System.out.println("Poll: " + numbers.poll());

        System.out.println("After poll: " + numbers);

        // 5. Add another element
        numbers.offer(5);

        System.out.println("After offer 5: " + numbers);

        // 6. Check whether an element exists
        System.out.println("Contains 30: " + numbers.contains(30));

        // 7. Get the size
        System.out.println("Size: " + numbers.size());

        // 8. Process elements in priority order
        System.out.println("Removing in priority order:");

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }

        // 9. Check whether the queue is empty
        System.out.println("Is empty: " + numbers.isEmpty());
    }
}
