package NEW;

import java.util.HashSet;
import java.util.ArrayList;

public class Hashsettoarraylist {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Convert HashSet to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(hashSet);

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}



