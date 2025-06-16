package NEW;
import java.util.*;

public class Heap {
	public static void main(String[]args) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		minHeap.add(12);
		minHeap.add(13);
		minHeap.add(14);
		minHeap.add(16);
		minHeap.add(17);
		System.out.println("Min HeapOutput:");
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(29);
		
		maxHeap.add(29);
		maxHeap.add(25);
		maxHeap.add(23);
		maxHeap.add(22);
		System.out.print("Max HeapOutput:");
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}
		
		
	}

}
