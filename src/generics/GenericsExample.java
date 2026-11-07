
package generics;

// 1. Generic class
class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// 2. Generic class with two type parameters
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class GenericsExample {

    // 3. Generic method
    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }
    }

    // 4. Bounded generic method
    public static <T extends Number> double getDoubleValue(T number) {
        return number.doubleValue();
    }

    public static void main(String[] args) {

        // Example 1: Box with Integer
        Box<Integer> integerBox = new Box<>();

        integerBox.setValue(100);

        System.out.println("Integer Box: "
                + integerBox.getValue());

        // Example 2: Box with String
        Box<String> stringBox = new Box<>();

        stringBox.setValue("Hello Java");

        System.out.println("String Box: "
                + stringBox.getValue());

        // Example 3: Pair with Integer and String
        Pair<Integer, String> student =
                new Pair<>(101, "Abraham");

        System.out.println("Student ID: "
                + student.getKey());

        System.out.println("Student Name: "
                + student.getValue());

        // Example 4: Generic method with Integer array
        Integer[] numbers = {10, 20, 30};

        System.out.println("Integer Array:");

        printArray(numbers);

        // Example 5: Generic method with String array
        String[] names = {"Abraham", "Daniel", "Michael"};

        System.out.println("String Array:");

        printArray(names);

        // Example 6: Bounded generic method
        System.out.println("Double Value: "
                + getDoubleValue(25));

        System.out.println("Double Value: "
                + getDoubleValue(12.5));
    }
}
