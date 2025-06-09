package kumar;
import java.util.*;


public class BfsImplementation {
	public static void main(String[]args) {
		Map<String,List<String>> k=new HashMap<String,List<String>>();
		k.put("reptile",Arrays.asList("Snake pit"));
		k.put("Santuary",Arrays.asList("parrot pavilion"));
		k.put("mamamal zone",Arrays.asList("lion Den"));
		k.put("Snake pit",new ArrayList<String>());
		k.put("parrot pavilion",new ArrayList<String>());
		
		k.put("Lion Den",new ArrayList<String>());
		bfs (k,"mamamal zone");
		
		
		
		
	}

	private static void bfs(Map<String, List<String>> zoo, String start ) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println("Visited: " + current);

            for (String neighbor : zoo.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
	}
}