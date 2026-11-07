
package utility;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityExample {

    public static void main(String[] args) {

        // 1. Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Original List: " + numbers);

        // 2. Sort in ascending order
        Collections.sort(numbers);

        System.out.println("Sorted List: " + numbers);

        // 3. Reverse the list
        Collections.reverse(numbers);

        System.out.println("Reversed List: " + numbers);

        // 4. Find the maximum value
        System.out.println("Maximum: "
                + Collections.max(numbers));

        // 5. Find the minimum value
        System.out.println("Minimum: "
                + Collections.min(numbers));

        // 6. Count the frequency of an element
        System.out.println("Frequency of 10: "
                + Collections.frequency(numbers, 10));

        // 7. Search using binarySearch
        Collections.sort(numbers);

        int index = Collections.binarySearch(numbers, 30);

        System.out.println("Index of 30: " + index);

        // 8. Swap two elements
        Collections.swap(numbers, 0, 1);

        System.out.println("After swapping: " + numbers);

        // 9. Rotate the list
        Collections.rotate(numbers, 2);

        System.out.println("After rotating: " + numbers);

        // 10. Replace all occurrences of an element
        Collections.replaceAll(numbers, 10, 100);

        System.out.println("After replacing 10: " + numbers);

        // 11. Shuffle the list
        Collections.shuffle(numbers);

        System.out.println("After shuffling: " + numbers);

        // 12. Create an immutable empty list
        ArrayList<Integer> anotherList = new ArrayList<>();

        anotherList.add(5);
        anotherList.add(15);

        System.out.println("Another List: " + anotherList);

        // 13. Find the size
        System.out.println("Size: " + numbers.size());
    }
}
