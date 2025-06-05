package NEW;

import java.util.TreeSet;

public class NithinTree {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<>();
        obj.add(8766);
        obj.add(8763);
        obj.add(8764);
        obj.add(8765);
        obj.add(8767);

        System.out.println("First book in the place: " + obj.first());
        System.out.println("Last book in the place: " + obj.last());
        System.out.println("Book higher than 8766: " + obj.higher(8766));
        System.out.println("Book lower than 8765: " + obj.lower(8765));
    }
}
