package NEW;
import java.util.*;
import java.util.List;
import java.util.Map;

public class FriendsGraph {
	public static void main(String[]args) {
		Map<String,List<String>>graph=new HashMap<>();
		graph.put("Alice",Arrays.asList("Bob"));
		graph.put("Bob",Arrays.asList("Alice","charlie"));
		graph.put("Bob",Arrays.asList("Alice","charlie"));
		graph.put("charlie",Arrays.asList("Bob"));
		System.out.println(graph);
		for(String person:graph.keySet()) {
			System.out.println(person+"is friends with"+graph.get(person));
		}
	}
}
