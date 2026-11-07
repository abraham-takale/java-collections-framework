
package set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        // 1. Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // 2. Add elements
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Original TreeSet: " + numbers);

        // 3. Get the first element
        System.out.println("First element: " + numbers.first());

        // 4. Get the last element
        System.out.println("Last element: " + numbers.last());

        // 5. Get the smallest element greater than or equal to 25
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));

        // 6. Get the greatest element less than or equal to 25
        System.out.println("Floor of 25: " + numbers.floor(25));

        // 7. Get elements smaller than 30
        System.out.println("HeadSet (less than 30): " + numbers.headSet(30));

        // 8. Get elements greater than or equal to 20
        System.out.println("TailSet (20 and above): " + numbers.tailSet(20));

        // 9. Get elements from 20 inclusive to 40 exclusive
        System.out.println("SubSet (20 to 40): " + numbers.subSet(20, 40));

        // 10. Remove an element
        numbers.remove(30);

        System.out.println("After removing 30: " + numbers);

        // 11. Get the size
        System.out.println("Size: " + numbers.size());

        // 12. Iterate through the TreeSet
        System.out.println("All elements:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
