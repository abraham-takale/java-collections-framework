
package list;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        // 1. Create a Stack
        Stack<Integer> numbers = new Stack<>();

        // 2. Push elements onto the Stack
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("Original Stack: " + numbers);

        // 3. View the top element without removing it
        System.out.println("Top element: " + numbers.peek());

        // 4. Remove and return the top element
        System.out.println("Popped element: " + numbers.pop());

        System.out.println("After pop: " + numbers);

        // 5. Add another element
        numbers.push(40);

        System.out.println("After push 40: " + numbers);

        // 6. Search for an element
        System.out.println("Position of 20: " + numbers.search(20));

        // 7. Check whether the Stack is empty
        System.out.println("Is empty: " + numbers.empty());

        // 8. Get the current size
        System.out.println("Size: " + numbers.size());

        // 9. Display the remaining elements
        System.out.println("All elements:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
