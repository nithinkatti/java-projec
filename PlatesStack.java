package NEW;

import java.util.Stack;

public class PlatesStack {
	public static void main(String[]args) {
		Stack<Integer>plateStack =new Stack<>();
		plateStack.push(1);
		plateStack.push(2);
		plateStack.push(3);
		plateStack.push(4);
		plateStack.push(5);
		System.out.println("Plates stacked:"+plateStack);
		int usedPlate=plateStack.pop();
		System.out.println("Plate used:"+usedPlate);
		System.out.println("Plates left:"+plateStack.size());
		System.out.println("Current stack:"+plateStack);
	}
}
		
