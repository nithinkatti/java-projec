package NEW;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
class Student{
	public void ArrayList() {
		
		ArrayList<String> n =new ArrayList<String>();
		n.add("nithin");
		n.add("subbu");
		n.add("sreedhar");
		System.out.println(n);
	}
	public void Linkedlist() {
		LinkedList<String>friend= new LinkedList<String>();
		friend.add("jdcjhv");
		friend.add("dfxz");
		friend.add("jddf");
		System.out.println(friend);
	}
	public void HashMap() {
		HashMap<Integer,String> nn= new HashMap<Integer,String>();
		nn.put(1,"vvvvv");
		nn.put(2,"nnnn");
		nn.put(3,"wwww");
		System.out.println(nn);
	}
	public void HashSet() {
		HashSet<String> nnn= new HashSet<String>();
		nnn.add("vvvvvv");
		nnn.add("nnnnn");
		nnn.add("wwwww");
		System.out.println(nnn);
	}
}
	public class All{
		public static void main(String[]args) {
			Student obj=new Student();
			obj.ArrayList();
			obj.Linkedlist();
			
			obj.HashMap();
			
			obj.HashSet();
		}
	}
	
	

































































