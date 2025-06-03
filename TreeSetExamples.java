package NEW;

import java.util.*;

public class TreeSetExamples {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);           // Output: [10, 20, 30, 40, 50]
        System.out.println(numbers.first());   // Output: 10
        System.out.println(numbers.higher(30)); // Output: 40
    }
}
