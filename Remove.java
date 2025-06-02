package NEW;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original List: " + fruits);

        // Removing "Banana" by value
        boolean isRemoved = fruits.remove("Banana");

        if (isRemoved) {
            System.out.println("\"Banana\" was removed from the list.");
        } else {
            System.out.println("\"Banana\" was not found in the list.");
        }

        System.out.println("Updated List: " + fruits);
    }
}



