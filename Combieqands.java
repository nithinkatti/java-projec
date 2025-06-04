package NEW;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Combieqands {
	public static void main(String[]args) {
		Stack<Integer>plateStack =new Stack<>();
		plateStack.push(1);
		plateStack.push(2);
		plateStack.push(3);
		plateStack.push(4);
		plateStack.push(5);
		System.out.println(plateStack);
		Queue<String>students=new LinkedList<String>();
		students.add("student 1");
		students.add("student 2");
		students.add("student 3");
		System.out.println(students);
		
	}

}
