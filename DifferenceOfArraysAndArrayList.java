import java.util.ArrayList;

public class DifferenceOfArraysAndArrayList {

    public static void main(String[] args) {
        //[Array] Demonstration
        //fixed-size array of integers

        int[] fixedArray = new int[3];

        // Assign values to array elements using their index.
        // Array indices start from 0.
        fixedArray[0] = 10;
        fixedArray[1] = 20;
        fixedArray[2] = 30;

        // Attempting to add an element beyond the defined size will result in an error (ArrayIndexOutOfBoundsException).
        // fixedArray[3] = 40; // This line would cause a runtime error.

        System.out.println("--- Array Demonstration ---");
        System.out.println("Elements in fixedArray:");
        for (int i = 0; i < fixedArray.length; i++) {
            System.out.println("Element at index " + i + ": " + fixedArray[i]);
        }
        System.out.println("Size of fixedArray: " + fixedArray.length); // The length property gives the size.
        System.out.println("--------------------------\n");


        // --- Demonstrating ArrayList ---
        // ArrayLists are dynamic in size. No need to specify the initial size.
        // Create an ArrayList to store String objects.
        ArrayList<String> dynamicList = new ArrayList<>();

        // Adding elements to the ArrayList using the add() method.
        // ArrayLists automatically adjust their size as elements are added.
        dynamicList.add("Strawberry");
        dynamicList.add("Banana");
        dynamicList.add("Cherry");

        // Adding more elements - the ArrayList resizes automatically.
        dynamicList.add("Orange");

        System.out.println("--- ArrayList Demonstration ---");
        System.out.println("Elements in dynamicList:");
        // Iterating through an ArrayList using a for-each loop.
        for (String fruit : dynamicList) {
            System.out.println(fruit);
        }

        // Accessing elements using the get() method.
        System.out.println("Element at index 1: " + dynamicList.get(1)); // Accessing elements by index.

        // Removing an element using the remove() method.
        dynamicList.remove("Banana"); // Removing an element by its value.
        // dynamicList.remove(0); // Alternatively, remove by index.

        System.out.println("\nElements in dynamicList after removing 'Banana':");
        for (String fruit : dynamicList) {
            System.out.println(fruit);
        }

        System.out.println("Size of dynamicList: " + dynamicList.size()); // The size() method gives the number of elements.
        System.out.println("--------------------------");
    }
}